package com.castronu.joomlajavaapi.dao;

import com.castronu.joomlajavaapi.domain.Category;
import com.castronu.joomlajavaapi.domain.Content;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import com.castronu.joomlajavaapi.utils.JoomlaDslUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static com.castronu.joomlajavaapi.builder.ContentBuilder.aContent;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 02:07
 * To change this template use File | Settings | File Templates.
 */
public class ContentDao extends HibernateDaoSupport {

    public static final Logger LOGGER = LoggerFactory.getLogger(CategoryDao.class);

    private final CategoryDao categoryDao;

    public ContentDao(CategoryDao categoryDao) {
        this.categoryDao=categoryDao;
    }

    public void createArticle(String title, String alias, String content, String link, String path,String description,String keywords) throws GenericErrorException {
        //TO TEST...
        int uniqueCategoryId;
        
        File file = new File(path);
        String categoryPath=file.getParent();
        List<Category> categoryFromPath = categoryDao.getCategoryFromPath(categoryPath);
        if (categoryFromPath.size()==0) {
            throw new GenericErrorException("There is no category for the path " + categoryPath);
        }
        else if (categoryFromPath.size()!=1) {
            throw new IllegalStateException("Two category with the samepath! "+categoryPath);
        } else {
            uniqueCategoryId=categoryFromPath.get(0).getId();
        }

        List<Content> articleInCategoryFromPathID = getArticleInCategoryFromCatiDAndTitle(title, categoryFromPath.get(0).getId());
        if (articleInCategoryFromPathID.size()!=0) {
            throw new GenericErrorException("There is already an article "+title+" in the category for the path " + categoryPath);
        }
      

        Content article = aContent(title, alias, content, link, path, uniqueCategoryId,description,keywords);

        System.out.println(article);
        try {
            LOGGER.info("Creating article {} in {}",title,categoryPath);
            getHibernateTemplate().save(JoomlaDslUtils.sanytize(article));
        } catch (NoSuchMethodException e) {
            throw new GenericErrorException("GRAVE" + categoryPath+"/"+title,e);
        } catch (InvocationTargetException e) {
            throw new GenericErrorException("GRAVE" + categoryPath+"/"+title,e);
        } catch (IllegalAccessException e) {
            throw new GenericErrorException("GRAVE" + categoryPath+"/"+title,e);
        }
    }

    public void deleteArticle(String title, String categoryPath) throws GenericErrorException {
        //TO TEST...
        List<Category> categoryFromPath = categoryDao.getCategoryFromPath(categoryPath);
        if (categoryFromPath.size()==0) {
            throw new GenericErrorException("There is no category for the path " + categoryPath);
        }
        List<Content> articleInCategoryFromPathID = getArticleInCategoryFromCatiDAndTitle(title, categoryFromPath.get(0).getId());

        if (articleInCategoryFromPathID.size()==0) {
            throw new GenericErrorException("There is no article "+title+" in the category for the path " + categoryPath +" to delete");
        }
        LOGGER.info("Deleteing article {} in {}",title,categoryPath);
            getHibernateTemplate().delete(articleInCategoryFromPathID.get(0));
    }




    @SuppressWarnings("unchecked")
    public List<Content> getArticleInCategoryFromCatiD(final int catId) {
        DetachedCriteria query = DetachedCriteria.forClass(Content.class);
        query.add(Property.forName("catid").eq(catId));
        return getHibernateTemplate().findByCriteria(query);
    }
    @SuppressWarnings("unchecked")
    public List<Content> getArticleInCategoryFromCatiDAndTitle(final String title, final int catId) {
        DetachedCriteria query = DetachedCriteria.forClass(Content.class);
        query.add(Property.forName("catid").eq(catId));
        query.add(Property.forName("title").eq(title));
        return getHibernateTemplate().findByCriteria(query);
    }
}
