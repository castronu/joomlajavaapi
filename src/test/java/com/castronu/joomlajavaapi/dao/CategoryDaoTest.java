package com.castronu.joomlajavaapi.dao;

import com.castronu.joomlajavaapi.ContextTest;
import com.castronu.joomlajavaapi.domain.Category;
import com.castronu.joomlajavaapi.exception.CategoryAlreadyExistException;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 02:44
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ContextTest.class)
public class CategoryDaoTest {

    @Autowired
    CategoryDao categoryDao;

    @org.junit.Test
    public void testSaveLoadAndDelete() throws Exception, GenericErrorException, CategoryAlreadyExistException {

        String categoryPath = "gli-stati-uniti";
        int id=categoryDao.createCategoryAndReturnCategoryId("Gli Stati Uniti","usa", categoryPath,1);
        List<Category> categoryFromPath = categoryDao.getCategoryFromPath(categoryPath);
        assertThat(categoryFromPath.size(), is(1));
        Category category = categoryFromPath.get(0);
        assertThat(category.getId(), is(id));
        assertThat(category.getId(), is(id));
        assertThat(category.getAlias(), is("usa"));
        assertThat(category.getTitle(), is("Gli Stati Uniti"));

        categoryDao.deleteCategory(categoryPath);
        categoryFromPath = categoryDao.getCategoryFromPath(categoryPath);
        assertThat(categoryFromPath.size(), is(0));

    }

    @org.junit.Test(expected = CategoryAlreadyExistException.class)
    public void testCategoryAlreadyExist() throws Exception, GenericErrorException, CategoryAlreadyExistException {

        String categoryPath = "la-francia";
        categoryDao.createCategoryAndReturnCategoryId("La Francia","francia", categoryPath,1);
        categoryDao.createCategoryAndReturnCategoryId("La Francia","francia", categoryPath,1);

    }

    /*
    @org.junit.Test
    public void testGetDefaultCategoryWithConversion() throws Exception {
        Category defaultCategory = aCategoryWithPath("", "", "La Catalunia/Il Barcelona");
        assertThat(defaultCategory.getLevel(),is(2));
        assertThat(defaultCategory.getTitle(),is("Il Barcelona"));
        assertThat(defaultCategory.getAlias(),is("il-barcelona"));
        assertThat(defaultCategory.getPath(),is("la-catalunia/il-barcelona"));
    }

    @org.junit.Test
    public void testGetDefaultCategory4level() throws Exception {
        Category defaultCategory = aCategoryWithPath("", "", "spagna/catalunia/barcelona/sportivi");
        assertThat(defaultCategory.getLevel(),is(4));
        assertThat(defaultCategory.getTitle(),is("Sportivi"));
        assertThat(defaultCategory.getAlias(),is("Sportivi"));
        assertThat(defaultCategory.getPath(),is("spagna/catalunia/barcelona/sportivi"));
    }

    @org.junit.Test
    public void testGetDefaultCategoryRootlevel() throws Exception {
        Category defaultCategory = aCategoryWithPath("", "", "spagna");
        assertThat(defaultCategory.getLevel(),is(1));
        assertThat(defaultCategory.getTitle(),is("Spagna"));
        assertThat(defaultCategory.getAlias(),is("Spagna"));
        assertThat(defaultCategory.getPath(),is("spagna"));
    } */
}
