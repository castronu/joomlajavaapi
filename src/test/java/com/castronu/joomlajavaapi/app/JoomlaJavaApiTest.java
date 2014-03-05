package com.castronu.joomlajavaapi.app;

import com.castronu.joomlajavaapi.ContextTest;
import com.castronu.joomlajavaapi.dao.CategoryDao;
import com.castronu.joomlajavaapi.domain.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: castronu
 * Date: 03/03/14
 * Time: 17:18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ContextTest.class)
public class JoomlaJavaApiTest {

    @Autowired
    JoomlaJavaApi joomlaJavaApi;
    @Autowired
    CategoryDao categoryDao;

    @Test
    public void createCategoryTest(){

        joomlaJavaApi.createCategoriesInCascade("Stati Uniti/Il Michigan/");
        //Two category should be created with path stati-uniti and il-michigan...
        //Let's use the dao to assert that the two categories exist...
        List<Category> categoryFromPath = categoryDao.getCategoryFromPath("stati-uniti");
        assertThat(categoryFromPath.size(),is(1));
        categoryFromPath = categoryDao.getCategoryFromPath("stati-uniti/il-michigan");
        assertThat(categoryFromPath.size(),is(1));

    }

    @Test
    public void createCategoryWithParents(){

        joomlaJavaApi.createCategoriesInCascade("Sud America/Colombia/Santa Marta");
        //Two category should be created with path stati-uniti and il-michigan...
        //Let's use the dao to assert that the two categories exist...
        List<Category> categoryFromPath = categoryDao.getCategoryFromPath("sud-america/colombia/santa-marta");
        assertThat(categoryFromPath.size(),is(1));
        int parentId = categoryFromPath.get(0).getParentId();
        List<Category> parentCategoryList = categoryDao.getCategoryFromId(parentId);
        assertThat(parentCategoryList.size(),is(1));
        assertThat(parentCategoryList.get(0).getPath(),is("sud-america/colombia"));
        assertThat(parentCategoryList.get(0).getTitle(),is("Colombia"));


    }

    @Test
    public void createCategoryWithParentsAndCategoryAlreadyExists(){

        joomlaJavaApi.createCategoriesInCascade("Sud America/Colombia/Santa Marta");
        joomlaJavaApi.createCategoriesInCascade("Sud America/Ecuador");
        //Two category should be created with path stati-uniti and il-michigan...
        //Let's use the dao to assert that the two categories exist...
        List<Category> categoryFromPath = categoryDao.getCategoryFromPath("sud-america/ecuador");
        assertThat(categoryFromPath.size(),is(1));
        int parentId = categoryFromPath.get(0).getParentId();
        List<Category> parentCategoryList = categoryDao.getCategoryFromId(parentId);
        assertThat(parentCategoryList.size(),is(1));
        assertThat(parentCategoryList.get(0).getPath(),is("sud-america"));
        assertThat(parentCategoryList.get(0).getTitle(),is("Sud America"));


    }



}
