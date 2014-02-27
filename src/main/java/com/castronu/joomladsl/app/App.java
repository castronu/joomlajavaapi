package com.castronu.joomladsl.app;
import com.castronu.joomladsl.Context;
import com.castronu.joomladsl.dao.CategoryDao;
import com.castronu.joomladsl.dao.ContentDao;
import com.castronu.joomladsl.dao.MenuDao;
import com.castronu.joomladsl.domain.Category;

import com.castronu.joomladsl.domain.Menu;
import com.castronu.joomladsl.exception.GenericErrorException;
import org.apache.commons.lang.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 00:33
 * To change this template use File | Settings | File Templates.
 */
public class App {

    public static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    private AnnotationConfigApplicationContext applicationContext;
    private ContentDao contentDao;
    private CategoryDao categoryDao;
    private MenuDao menuDao;
    public App(){
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
        System.out.println(internalPath);

            createMenuAndCategory(internalPath);
            if (splittedPath.length==1) {

            }

        for (int i=1;i<splittedPath.length;i++){
            internalPath+="/"+splittedPath[i];
            System.out.println(internalPath);

                createMenuAndCategory(internalPath);

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

