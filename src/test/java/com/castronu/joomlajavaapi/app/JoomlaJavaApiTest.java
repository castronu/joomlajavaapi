package com.castronu.joomlajavaapi.app;

import com.castronu.joomlajavaapi.ContextTest;
import com.castronu.joomlajavaapi.dao.CategoryDao;
import com.castronu.joomlajavaapi.dao.ContentDao;
import com.castronu.joomlajavaapi.dao.MenuDao;
import com.castronu.joomlajavaapi.domain.Category;
import com.castronu.joomlajavaapi.domain.Content;
import com.castronu.joomlajavaapi.domain.Menu;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.castronu.joomlajavaapi.builder.CategoryBuilder.aCategoryWithPath;
import static com.castronu.joomlajavaapi.builder.MenuBuilder.aMenu;
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
    @Autowired
    ContentDao contentDao;
    @Autowired
    MenuDao menuDao;

    @Before
    public void init() throws GenericErrorException {
        Category category = aCategoryWithPath("ROOT", "root", "", 0);
        categoryDao.save(category);
        Menu menu = aMenu("ROOTMenu","root","",0);
        menuDao.getHibernateTemplate().save(menu);

    }

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
    public void rgtLftCategoryTest(){

        categoryDao.getHibernateTemplate().deleteAll(categoryDao.getHibernateTemplate().loadAll(Category.class));
        //This is the root, should be always consistent (rgt is the max of all rgt, lft is 0)
        Category category = aCategoryWithPath("ROOT", "root", "", 0);
        categoryDao.save(category);

        joomlaJavaApi.createCategoriesInCascade("Sud America/Ecuador");

        categoryDao.rebuildCategoryTree();
        //Assert root category
        List<Category> categoryFromPath = categoryDao.getCategoryFromPath("");



        Category rootCategory = categoryFromPath.get(0);
        assertThat(rootCategory.getLft(),is(0));
        assertThat(rootCategory.getRgt(),is(5));
        //Assert brand new category
        categoryFromPath = categoryDao.getCategoryFromPath("sud-america/ecuador");
        Category newCategory = categoryFromPath.get(0);
        assertThat(newCategory.getLft(),is(2));
        assertThat(newCategory.getRgt(),is(3));

        categoryFromPath = categoryDao.getCategoryFromPath("sud-america");
        newCategory = categoryFromPath.get(0);
        assertThat(newCategory.getLft(),is(1));
        assertThat(newCategory.getRgt(),is(4));




    }

    @Test
    public void createCategoryAndMenuWithParents(){

        joomlaJavaApi.createCategoriesInCascadeWithMenu("Nord America/Colombia/Santa Marta");
        List<Menu> menuWithThisPath = menuDao.getMenuWithThisPath("nord-america/colombia/santa-marta");
        assertThat(menuWithThisPath.size(),is(1));
        Menu menu = menuWithThisPath.get(0);
        int parentId = menu.getParentId();
        menuWithThisPath = menuDao.getMenuWithThisPath("nord-america/colombia");
        assertThat(menuWithThisPath.size(),is(1));
        assertThat(menuWithThisPath.get(0).getId(),is(parentId));



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

    @Test
    public void createArticle() throws GenericErrorException {

        String categoryPath = "Sud America/Colombia/Santa Marta";
        joomlaJavaApi.createCategoriesInCascade(categoryPath);
        String articleTitle = "Palomino";
        joomlaJavaApi.createArticle(articleTitle, "Ottimo link su Palomino", "http://www.palomino.com", categoryPath, "description","palomino keywords");

        List<Category> categoryFromPath = categoryDao.getCategoryFromPath("sud-america/colombia/santa-marta");
        assertThat(categoryFromPath.size(),is(1));
        int categoryId = categoryFromPath.get(0).getId();
        List<Content> articleInCategoryFromCatiDAndTitle = contentDao.getArticleInCategoryFromCatiDAndTitle(articleTitle, categoryId);
        assertThat(articleInCategoryFromCatiDAndTitle.size(),is(1));

    }

    @Test
    public void createMenuForCategoryTest() throws GenericErrorException {

        String categoryPath = "Sud America/Colombia/Santa Marta";
        joomlaJavaApi.createCategoriesInCascade(categoryPath);
        joomlaJavaApi.createMenuForCategory("Sud America");
        joomlaJavaApi.createMenuForCategory("Sud America/Colombia");
        joomlaJavaApi.createMenuForCategory("Sud America/Colombia/Santa Marta");

        List<Menu> menuWithThisPath = menuDao.getMenuWithThisPath(Converter.getPath(categoryPath));
        assertThat(menuWithThisPath.size(),is(1));
        Menu menu = menuWithThisPath.get(0);
        assertThat(menu.getTitle(),is("Santa Marta"));
        assertThat(menu.getAccess(),is(1));
        assertThat(menu.getAlias(),is("santa-marta"));

        menuWithThisPath = menuDao.getMenuWithThisPath("sud-america/colombia");
        int expectedParentId = menuWithThisPath.get(0).getId();
        int newExpectedParentId = menuWithThisPath.get(0).getParentId();
        assertThat(menu.getParentId(), is(expectedParentId));


        menuWithThisPath = menuDao.getMenuWithThisPath("sud-america");
        assertThat(menuWithThisPath.get(0).getId(),is(newExpectedParentId));
    }




}
