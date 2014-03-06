package com.castronu.joomlajavaapi.dao;

import com.castronu.joomlajavaapi.domain.Category;
import com.castronu.joomlajavaapi.exception.CategoryAlreadyExistException;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import com.castronu.joomlajavaapi.utils.JoomlaDslUtils;
import org.hibernate.criterion.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.List;

import static com.castronu.joomlajavaapi.builder.CategoryBuilder.aCategoryWithPath;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:35
 * To change this template use File | Settings | File Templates.
 */
public class CategoryDao extends HibernateDaoSupport {

    public static final Logger LOGGER = LoggerFactory.getLogger(CategoryDao.class);


    public CategoryDao() {
    }

    public void save(Category category) {
        getHibernateTemplate().save(category);
    }

    public List<Category> getCategoryFromId(Integer id) {
        DetachedCriteria query = DetachedCriteria.forClass(Category.class);
        query.add(Property.forName("id").eq(id));
        List<Category> byCriteria = getHibernateTemplate().findByCriteria(query);
        return getHibernateTemplate().findByCriteria(query);
    }


    @SuppressWarnings("unchecked")
    public List<Category> getCategoryFromPath(final String path) {
        DetachedCriteria query = DetachedCriteria.forClass(Category.class);

        query.add(Property.forName("path").eq(path));
        return getHibernateTemplate().findByCriteria(query);
    }

    @SuppressWarnings("unchecked")
    public int createCategoryAndReturnCategoryId(String title, String alias, String path, int parentId) throws GenericErrorException, CategoryAlreadyExistException {
        if (getCategoryFromPath(path).size() != 0) {
            throw new CategoryAlreadyExistException(path);
        }

        Category category = aCategoryWithPath(title, alias, path, parentId);

        try {
            getHibernateTemplate().save(JoomlaDslUtils.sanytize(category));
            rebuildCategoryTree();
            List<Category> categoryFromPath = getCategoryFromPath(path);
            return categoryFromPath.get(0).getId();
        } catch (NoSuchMethodException e) {
            throw new GenericErrorException("GRAVE" + path, e);
        } catch (InvocationTargetException e) {
            throw new GenericErrorException("GRAVE" + path, e);
        } catch (IllegalAccessException e) {
            throw new GenericErrorException("GRAVE" + path, e);
        }
    }

    private void rebuildCategoryTree() {

        List<Category> categories = getHibernateTemplate().loadAll(Category.class);
        for (Category category : categories) {
            category.setRgt(-1);
            category.setLft(-1);
            persist(category);
        }

        DetachedCriteria query = DetachedCriteria.forClass(Category.class);
        query.add(Property.forName("parentId").eq(1));
        query.addOrder(Order.asc("id"));
        List<Category> firstLevelCategories = getHibernateTemplate().findByCriteria(query);
        Integer counter = 1;
        counter = rebuildBranch(firstLevelCategories, counter);
        //Get the ROOT
        List<Category> categoryFromId = getCategoryFromPath("");
        Category rootCategory = categoryFromId.get(0);
        rootCategory.setLft(0);
        rootCategory.setRgt(counter);
        persist(rootCategory);


    }

    private int rebuildBranch(List<Category> categoriesToAnalyse, Integer counter) {
        for (Category category : categoriesToAnalyse) {
            category.setLft(counter++);
            if (isLeaf(category)) {
                category.setRgt(counter++);
            } else {
                DetachedCriteria query = DetachedCriteria.forClass(Category.class);
                query.add(Property.forName("parentId").eq(category.getId()));
                query.addOrder(Order.asc("id"));
                List<Category> subCategories = getHibernateTemplate().findByCriteria(query);
                counter=rebuildBranch(subCategories, counter);
                category.setRgt(counter++);

            }
            persist(category);

        }
        return counter;
    }

    private void persist(Category category) {
        Timestamp time = new Timestamp(0);
        category.setCheckedOutTime(time);
        category.setCreatedTime(time);
        category.setModifiedTime(time);
        getHibernateTemplate().update(category);
    }

    private boolean isLeaf(Category category) {
        DetachedCriteria query = DetachedCriteria.forClass(Category.class);
        query.add(Property.forName("parentId").eq(category.getId()));
        List<Category> categories = getHibernateTemplate().findByCriteria(query);
        if (categories.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    ;

    @SuppressWarnings("unchecked")
    public void deleteCategory(String path) throws GenericErrorException {
        List<Category> categoryFromPath = getCategoryFromPath(path);
        if (categoryFromPath.size() == 0) {
            throw new GenericErrorException("No category for the path " + path);
        }
        getHibernateTemplate().delete(categoryFromPath.get(0));
    }


}

//[Category{id=16,assetId=68,parentId=15,lft=28,rgt=29,level=2,path='catalunia/barcelona',extension='com_content',title='catalunia/barcelona',alias='barcelona',note='',description='',published=true,checkedOut=0,checkedOutTime=1970-01-01 01:00:00.0,access=1,params='{"category_layout":"","image":""}',metadesc='',metakey='',metadata='{"author":"","robots":""}',createdUserId=838,createdTime=1970-01-01 01:00:00.0,modifiedUserId=0,modifiedTime=1970-01-01 01:00:00.0,hits=0,language='*',version=1}]
