package com.castronu.joomlajavaapi.dao;

import com.castronu.joomlajavaapi.builder.CategoryBuilder;
import com.castronu.joomlajavaapi.dao.CategoryDao;
import com.castronu.joomlajavaapi.dao.ContentDao;
import com.castronu.joomlajavaapi.domain.Category;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.Arrays;
import java.util.Collections;

import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 13:38
 * To change this template use File | Settings | File Templates.
 */
@Ignore("To refactor")
public class ContentDaoTest {

    CategoryDao categoryDao;
    ContentDao contentDao;
    HibernateTemplate hibernateTemplate;

    @Before
    public void init() {
        categoryDao = Mockito.mock(CategoryDao.class);
        contentDao = new ContentDao(categoryDao);
        HibernateTemplate hibernateTemplate = Mockito.mock(HibernateTemplate.class);
        contentDao.setHibernateTemplate(hibernateTemplate);

    }

    @Test(expected = GenericErrorException.class)
    public void testCreateArticle() throws Exception, GenericErrorException {
        when(categoryDao.getCategoryFromPath("category/suCategroy")).
                thenReturn(Collections.EMPTY_LIST);
        contentDao.createArticle("aTitle", "aContent", "category/suCategroy","","","","");

    }

    @Test(expected = IllegalStateException.class)
    public void testCreateArticleErrorIfTwoArticleWithSameCategoryAndTitle() throws Exception, GenericErrorException {
        Category category= CategoryBuilder.aCategoryWithPath("Category", "SuCategory", "category/suCategroy",1);
        when(categoryDao.getCategoryFromPath("category/suCategroy")).
                thenReturn(Arrays.asList(category,category));
        contentDao.createArticle("aTitle", "aContent", "category/suCategroy","","","","");
    }
    //TODO: integration test with DB needed!

    @Test
    public void testDeleteArticle() throws Exception {

    }
}
