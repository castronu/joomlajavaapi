package com.castronu.joomlajavaapi.dao;

import java.io.File;
import java.sql.Timestamp;
import java.util.List;

import com.castronu.joomlajavaapi.app.Converter;
import com.castronu.joomlajavaapi.builder.MenuBuilder;
import com.castronu.joomlajavaapi.domain.Category;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import com.sun.tools.javac.util.Convert;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Property;
import org.joda.time.DateMidnight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.castronu.joomlajavaapi.domain.Menu;

public class MenuDao extends HibernateDaoSupport {

    public static final Logger LOGGER = LoggerFactory.getLogger(CategoryDao.class);
    
    @SuppressWarnings("unchecked")
    public List<Menu> getMenuWithThisPath(final String menuPath) {
        DetachedCriteria query = DetachedCriteria.forClass(Menu.class);
        query.add(Property.forName("path").eq(menuPath));
        return getHibernateTemplate().findByCriteria(query);
    }

    public void createMenuCategory(String title,String alias,String path,int categoryId) throws GenericErrorException {
        List<Menu> menuWithThisPath = getMenuWithThisPath(path);
        if (menuWithThisPath.size()!=0) {
            throw new GenericErrorException("There is already a menu with this path " + path);
        }
        int parentId = computeParentId(path);
        Menu menu = MenuBuilder.aMenuCategory(title, alias, path, categoryId, parentId);
        getHibernateTemplate().save(menu);
        rebuildMenuTree();
        LOGGER.info("Menu "+ path + " created");
    }

    public int computeParentId(String path) throws GenericErrorException {
        File file = new File(path);
        String parent = file.getParent();
        if (parent==null) {return 1;}
        else {
            List<Menu> menuWithThisPath = getMenuWithThisPath(Converter.getPath(parent));
            if (menuWithThisPath.size()==0) {
                throw new GenericErrorException("No parent category menu found for parent "+parent);
            }
            return menuWithThisPath.get(0).getId();
        }

    }
    //TODO These private methods should be refactored in a Generic Rebuilder class...
    private void rebuildMenuTree() {

        List<Menu> menus = getHibernateTemplate().loadAll(Menu.class);
        for (Menu menu : menus) {
            menu.setRgt(-1);
            menu.setLft(-1);
            persist(menu);
        }

        DetachedCriteria query = DetachedCriteria.forClass(Menu.class);
        query.add(Property.forName("parentId").eq(1));
        query.addOrder(Order.asc("id"));
        List<Menu> firstLevelMenus = getHibernateTemplate().findByCriteria(query);
        Integer counter = 1;
        counter = rebuildBranch(firstLevelMenus, counter);
        //Get the ROOT
        List<Menu> menuFromId = getMenuWithThisPath("");
        Menu rootMenu = menuFromId.get(0);
        rootMenu.setLft(0);
        rootMenu.setRgt(counter);
        persist(rootMenu);


    }

    private int rebuildBranch(List<Menu> menuToAnalyse, Integer counter) {
        for (Menu menu : menuToAnalyse) {
            menu.setLft(counter++);
            if (isLeaf(menu)) {
                menu.setRgt(counter++);
            } else {
                DetachedCriteria query = DetachedCriteria.forClass(Menu.class);
                query.add(Property.forName("parentId").eq(menu.getId()));
                query.addOrder(Order.asc("id"));
                List<Menu> subMenu = getHibernateTemplate().findByCriteria(query);
                counter=rebuildBranch(subMenu, counter);
                menu.setRgt(counter++);

            }
            persist(menu);

        }
        return counter;
    }

    private void persist(Menu menu) {
        Timestamp time = new Timestamp(new DateMidnight().getMillis());
        menu.setCheckedOutTime(time);
        getHibernateTemplate().update(menu);
    }

    private boolean isLeaf(Menu menu) {
        DetachedCriteria query = DetachedCriteria.forClass(Menu.class);
        query.add(Property.forName("parentId").eq(menu.getId()));
        List<Menu> menus = getHibernateTemplate().findByCriteria(query);
        if (menus.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void createMenuArticle(String title,String alias,String path,int articleId,int categoryId){
        //TODO Parent ID
        Menu menu = MenuBuilder.aMenuArticle(title,alias, path, articleId,categoryId);
        getHibernateTemplate().save(menu);
        LOGGER.info("Menu for the article "+ path + " created");
    }
}
