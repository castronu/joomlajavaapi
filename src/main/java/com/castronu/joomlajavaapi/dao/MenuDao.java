package com.castronu.joomlajavaapi.dao;

import java.io.File;
import java.util.List;

import com.castronu.joomlajavaapi.app.Converter;
import com.castronu.joomlajavaapi.builder.MenuBuilder;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import com.sun.tools.javac.util.Convert;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
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
        Menu menu = MenuBuilder.aMenuCategory(title, alias, path, categoryId,parentId);
        getHibernateTemplate().save(menu);
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

    public void createMenuArticle(String title,String alias,String path,int articleId,int categoryId){
        //TODO Parent ID
        Menu menu = MenuBuilder.aMenuArticle(title,alias, path, articleId,categoryId);
        System.out.println(title+" "+alias+" "+ path+" "+ articleId+" "+categoryId);
        getHibernateTemplate().save(menu);
    }
}
