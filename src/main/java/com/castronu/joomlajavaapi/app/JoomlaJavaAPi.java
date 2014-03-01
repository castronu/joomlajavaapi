package com.castronu.joomlajavaapi.app;
import com.castronu.joomlajavaapi.Context;
import com.castronu.joomlajavaapi.dao.CategoryDao;
import com.castronu.joomlajavaapi.dao.ContentDao;
import com.castronu.joomlajavaapi.dao.MenuDao;

import com.castronu.joomlajavaapi.exception.GenericErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:33
 * To change this template use File | Settings | File Templates.
 */
public class JoomlaJavaApi {

    public static final Logger LOGGER = LoggerFactory.getLogger(JoomlaJavaApi.class);
    private AnnotationConfigApplicationContext applicationContext;
    private ContentDao contentDao;
    private CategoryDao categoryDao;
    private MenuDao menuDao;
    public JoomlaJavaApi(){
    	applicationContext = new AnnotationConfigApplicationContext(Context.class);
    	contentDao =  applicationContext.getBean(ContentDao.class);
    	categoryDao = applicationContext.getBean(CategoryDao.class);
    	menuDao = applicationContext.getBean(MenuDao.class);
    }

    public void createArticle(String title,String content,String link,String categoryPath,String description,String keywords) throws GenericErrorException{
    	String convertePath=Converter.getPath(categoryPath);

    	String alias=Converter.getAlias(title);
    	String path=Converter.getPath(categoryPath)+"/"+alias;
        System.out.println("title="+title+"alias="+alias+" Path="+path);

        File file = new File(path);

  	  String parentCategoryPath = file.getParent();


    	  contentDao.createArticle(title.trim(),alias,content,link,path,description,keywords);


		  int categoryId=categoryDao.getCategoryFromPath(parentCategoryPath).get(0).getId();
		  System.out.println("category id"+categoryId);
    	  int parentMenuId = menuDao.getMenuWithThisPath(parentCategoryPath).get(0).getId();

    	  int articleId=contentDao.getArticleInCategoryFromCatiDAndTitle(title, categoryId).get(0).getId();

    	  System.out.println(title+"  "+alias+ "   "+ path+"    "+ articleId+"    "+ parentMenuId);
    	  menuDao.createMenuArticle(title, alias, path, articleId,parentMenuId);
    }

    public void deleteArticle(String tilte,String categoryPath) throws GenericErrorException{
  	  contentDao.deleteArticle(tilte,categoryPath);
  }

    private int createACategory(String categoryPath) throws GenericErrorException {

        String path=Converter.getPath(categoryPath);
        String alias=Converter.getAlias(categoryPath);
        String title=Converter.getTitle(categoryPath);
        //categoryPath="La Spagna"
        System.out.println(path);
        System.out.println(alias);
        System.out.println(title);
        return categoryDao.createCategory(title,alias,path);
        //menuDao.createMenuCategory(categoryPath,categoryId);

    }

    public void createCategory(String categoryPath) {
        String[] splittedPath = categoryPath.split("/");
        String internalPath=splittedPath[0];

        try {
            createACategory(internalPath);
            LOGGER.info(internalPath + " category created");

        } catch (GenericErrorException e) {
            LOGGER.error("error",e);
        }

        if (splittedPath.length==1) {
           return;
        }


        for (int i=1;i<splittedPath.length;i++){
            internalPath+="/"+splittedPath[i];
            try {
                createACategory(internalPath);
                LOGGER.info(internalPath + " category created");

            } catch (GenericErrorException e) {
                LOGGER.error("Problems creating category",e);
            }

        }
    }




    private void createMenuAndCategory(String internalPath) {
        String path= Converter.getPath(internalPath);
        String alias=Converter.getAlias(internalPath);
        String title=Converter.getTitle(internalPath);
        try {
            int categoryId = createACategory(internalPath);
            menuDao.createMenuCategory(title, alias, path, categoryId);
        } catch (GenericErrorException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }






}

