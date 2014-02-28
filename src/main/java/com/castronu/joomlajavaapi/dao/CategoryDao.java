package com.castronu.joomlajavaapi.dao;

import com.castronu.joomlajavaapi.domain.Category;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import com.castronu.joomlajavaapi.utils.JoomlaDslUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.lang.reflect.InvocationTargetException;
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

    public Category load(Integer id) {
        return (Category) getHibernateTemplate().load(Category.class, id);
    }


    @SuppressWarnings("unchecked")
    public List<Category> getCategoryFromPath(final String path) {
        DetachedCriteria query = DetachedCriteria.forClass(Category.class);

        query.add(Property.forName("path").eq(path));
        return getHibernateTemplate().findByCriteria(query);
    }

    @SuppressWarnings("unchecked")
    public int createCategory(String title, String alias, String path) throws GenericErrorException {
        if (getCategoryFromPath(path).size() != 0) {
            throw new GenericErrorException("There is already a category for the path " + path);
        }
        Category category = aCategoryWithPath(title,alias,path);

        try {
            getHibernateTemplate().save(JoomlaDslUtils.sanytize(category));
            List<Category> categoryFromPath = getCategoryFromPath(path);
            return categoryFromPath.get(0).getId();
        } catch (NoSuchMethodException e) {
            throw new GenericErrorException("GRAVE" + path,e);
        } catch (InvocationTargetException e) {
            throw new GenericErrorException("GRAVE" + path,e);
        } catch (IllegalAccessException e) {
            throw new GenericErrorException("GRAVE" + path,e);
        }
    }

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
