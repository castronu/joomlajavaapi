package com.castronu.joomlajavaapi.app;

import com.castronu.joomlajavaapi.dao.CategoryDao;
import com.castronu.joomlajavaapi.dao.ContentDao;
import com.castronu.joomlajavaapi.dao.MenuDao;

import com.castronu.joomlajavaapi.domain.Category;
import com.castronu.joomlajavaapi.exception.CategoryAlreadyExistException;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;

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

        String alias = Converter.getAlias(title);
        String path = Converter.getPath(categoryPath) + "/" + alias;
        System.out.println("title=" + title + "alias=" + alias + " Path=" + path);

        File file = new File(path);

        String parentCategoryPath = file.getParent();

        contentDao.createArticle(title.trim(), alias, content, link, path, description, keywords);

        int categoryId = categoryDao.getCategoryFromPath(parentCategoryPath).get(0).getId();
        /*int parentMenuId = menuDao.getMenuWithThisPath(parentCategoryPath).get(0).getId();

        int articleId = contentDao.getArticleInCategoryFromCatiDAndTitle(title, categoryId).get(0).getId();

        System.out.println(title + "  " + alias + "   " + path + "    " + articleId + "    " + parentMenuId);
        menuDao.createMenuArticle(title, alias, path, articleId, parentMenuId);    */
    }

    public void createArticleWithLinkedMenu(String title, String content, String link, String categoryPath, String description, String keywords) throws GenericErrorException {

        String alias = Converter.getAlias(title);
        String path = Converter.getPath(categoryPath) + "/" + alias;
        System.out.println("title=" + title + "alias=" + alias + " Path=" + path);

        File file = new File(path);

        String parentCategoryPath = file.getParent();

        contentDao.createArticle(title.trim(), alias, content, link, path, description, keywords);

        int categoryId = categoryDao.getCategoryFromPath(parentCategoryPath).get(0).getId();
        /*int parentMenuId = menuDao.getMenuWithThisPath(parentCategoryPath).get(0).getId();

        int articleId = contentDao.getArticleInCategoryFromCatiDAndTitle(title, categoryId).get(0).getId();

        System.out.println(title + "  " + alias + "   " + path + "    " + articleId + "    " + parentMenuId);
        menuDao.createMenuArticle(title, alias, path, articleId, parentMenuId);    */
    }

    public void deleteArticle(String tilte, String categoryPath) throws GenericErrorException {
        contentDao.deleteArticle(tilte, categoryPath);
    }

    private int createACategory(String categoryPath, int parentId) throws GenericErrorException, CategoryAlreadyExistException {

        String path = Converter.getPath(categoryPath);
        String alias = Converter.getAlias(categoryPath);
        String title = Converter.getTitle(categoryPath);
        return categoryDao.createCategoryAndReturnCategoryId(title, alias, path, parentId);

    }

    public void createCategoriesInCascadeWithMenu(String categoryPath){
        createCategoriesInCascade(categoryPath,true);

    }

    public void createCategoriesInCascade(String categoryPath){
        createCategoriesInCascade(categoryPath,false);

    }

    private void createCategoriesInCascade(String categoryPath, boolean withMenu) {
        String[] splittedPath = categoryPath.split("/");
        String internalPath = splittedPath[0];
        int parentId = 0;
        try {
            parentId = withMenu ? createCategoryWithMenu(internalPath, 1) : createACategory(internalPath, 1);
            LOGGER.info("Category {} created", internalPath);
        } catch (GenericErrorException e) {
            LOGGER.error("Category not created, error:", e);
        } catch (CategoryAlreadyExistException e) {
            LOGGER.info("Category {} already exist", e.getCategory());
            parentId = categoryDao.getCategoryFromPath(e.getCategory()).get(0).getId();//To clean
        }

        if (splittedPath.length == 1) {
            return;
        }

        for (int i = 1; i < splittedPath.length; i++) {
            internalPath += "/" + splittedPath[i];

            try {
                parentId = withMenu ? createCategoryWithMenu(internalPath, 1) : createACategory(internalPath, parentId);
                LOGGER.info("Category {} created", internalPath);
            } catch (GenericErrorException e) {
                LOGGER.error("Category not created, error:", e);
            } catch (CategoryAlreadyExistException e) {
                LOGGER.info("Category {} already exist", e.getCategory());
                parentId = categoryDao.getCategoryFromPath(e.getCategory()).get(0).getId();//To clean
            }

        }
    }

    private int createCategoryWithMenu(String internalPath, int parentId) throws GenericErrorException, CategoryAlreadyExistException {
        String path = Converter.getPath(internalPath);
        String alias = Converter.getAlias(internalPath);
        String title = Converter.getTitle(internalPath);
        int categoryId = createACategory(internalPath, parentId);
        menuDao.createMenuCategory(title, alias, path, categoryId);
        return categoryId;

    }

    public void createMenuForCategory(String categoryPath) {
        List<Category> categoryFromPath = categoryDao.getCategoryFromPath(Converter.getPath(categoryPath));
        if (categoryFromPath.size()>1) {
            throw new IllegalStateException("More then one category with path "+categoryPath);
        } else if (categoryFromPath.size()==0) {
            LOGGER.error("No category found with path "+categoryPath);
            return;
        }
        int categoryId = categoryFromPath.get(0).getId();
        try {
            menuDao.createMenuCategory(Converter.getTitle(categoryPath),Converter.getAlias(categoryPath),Converter.getPath(categoryPath),categoryId);
            LOGGER.info("Menu for the category "+categoryPath+" created");
        } catch (GenericErrorException e) {
            LOGGER.error(e.getMessage());
        }
    }
}

