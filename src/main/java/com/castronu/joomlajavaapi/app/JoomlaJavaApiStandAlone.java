package com.castronu.joomlajavaapi.app;

import com.castronu.joomlajavaapi.Context;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: castronu
 * Date: 02/03/14
 * Time: 20:38
 * To change this template use File | Settings | File Templates.
 */
public class JoomlaJavaApiStandalone {

    private static AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(Context.class);
    private static JoomlaJavaApi joomlaJavaApi=applicationContext.getBean(JoomlaJavaApi.class);
    public static void createArticle(String title,String content,String link,String categoryPath,String description,String keywords) throws GenericErrorException {
        joomlaJavaApi.createArticle(title,content,link,categoryPath,description,keywords);
    }
    public static void createCategory(String categoryPath) {
        joomlaJavaApi.createCategory(categoryPath);
    }
}
