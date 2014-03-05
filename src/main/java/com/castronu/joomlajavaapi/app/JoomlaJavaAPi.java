package com.castronu.joomlajavaapi.app;

import com.castronu.joomlajavaapi.dao.CategoryDao;
import com.castronu.joomlajavaapi.dao.ContentDao;
import com.castronu.joomlajavaapi.dao.MenuDao;

import com.castronu.joomlajavaapi.exception.CategoryAlreadyExistException;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:33
 */
public class JoomlaJavaApi {

    public static final Logger LOGGER = LoggerFactory.getLogger(JoomlaJavaApi.class);
    private final ContentDao contentDao;
    private final CategoryDao categoryDao;
    private final MenuDao menuDao;

    public JoomlaJavaApi(ContentDao contentDao, CategoryDao categoryDao, MenuDao menuDao) {
        this.contentDao = contentDao;
        this.categoryDao = categoryDao;
        this.menuDao = menuDao;
    }

    public void createArticle(String title, String content, String link, String categoryPath, String description, String keywords) throws GenericErrorException {
        String convertePath = Converter.getPath(categoryPath);

        String alias = Converter.getAlias(title);
        String path = Converter.getPath(categoryPath) + "/" + alias;
        System.out.println("title=" + title + "alias=" + alias + " Path=" + path);

        File file = new File(path);

        String parentCategoryPath = file.getParent();


        contentDao.createArticle(title.trim(), alias, content, link, path, description, keywords);


        int categoryId = categoryDao.getCategoryFromPath(parentCategoryPath).get(0).getId();
        System.out.println("category id" + categoryId);
        int parentMenuId = menuDao.getMenuWithThisPath(parentCategoryPath).get(0).getId();

        int articleId = contentDao.getArticleInCategoryFromCatiDAndTitle(title, categoryId).get(0).getId();

        System.out.println(title + "  " + alias + "   " + path + "    " + articleId + "    " + parentMenuId);
        menuDao.createMenuArticle(title, alias, path, articleId, parentMenuId);
    }

    public void deleteArticle(String tilte, String categoryPath) throws GenericErrorException {
        contentDao.deleteArticle(tilte, categoryPath);
    }

    private int createACategory(String categoryPath,int parentId) throws GenericErrorException, CategoryAlreadyExistException {

        String path = Converter.getPath(categoryPath);
        String alias = Converter.getAlias(categoryPath);
        String title = Converter.getTitle(categoryPath);
        return categoryDao.createCategoryAndReturnCategoryId(title, alias, path, parentId);

    }

    public void createCategoriesInCascade(String categoryPath) {
        String[] splittedPath = categoryPath.split("/");
        String internalPath = splittedPath[0];
        int parentId=0;
        try {
            parentId=createACategory(internalPath, 1);
            LOGGER.info("Category {} created", internalPath);
        } catch (GenericErrorException e) {
            LOGGER.error("Category not created, error:", e);
        } catch (CategoryAlreadyExistException e) {
            LOGGER.info("Category {} already exist", e.getCategory());
            parentId=categoryDao.getCategoryFromPath(e.getCategory()).get(0).getId();//To clean
        }

        if (splittedPath.length == 1) {
            return;
        }

        for (int i = 1; i < splittedPath.length; i++) {
            internalPath += "/" + splittedPath[i];

            try {
                parentId=createACategory(internalPath,parentId);
                LOGGER.info("Category {} created", internalPath);
            } catch (GenericErrorException e) {
                LOGGER.error("Category not created, error:", e);
            } catch (CategoryAlreadyExistException e) {
                LOGGER.info("Category {} already exist", e.getCategory());
                parentId=categoryDao.getCategoryFromPath(e.getCategory()).get(0).getId();//To clean
            }

        }
    }

    /*private void createMenuAndCategory(String internalPath) {
        String path = Converter.getPath(internalPath);
        String alias = Converter.getAlias(internalPath);
        String title = Converter.getTitle(internalPath);
        int categoryId = 0;
        try {
            categoryId = createACategory(internalPath);
            menuDao.createMenuCategory(title, alias, path, categoryId);
        } catch (CategoryAlreadyExistException e) {
            LOGGER.info("Category {} already exist", e.getCategory());
        } catch (GenericErrorException e) {
            LOGGER.error("Problems creating category and menu, error:", e);

        }
    }*/

}

