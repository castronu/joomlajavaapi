package com.castronu.joomlajavaapi.app;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import com.castronu.joomlajavaapi.Context;
import com.castronu.joomlajavaapi.app.JoomlaJavaApi;
import com.castronu.joomlajavaapi.exception.GenericErrorException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	 @org.junit.Test
	    public void testApp() throws Exception, GenericErrorException {
         /*JoomlaJavaApi app = new JoomlaJavaApi();
         app.createCategory("b/b1");
         app.createCategory("b/b2");
         //app.createArticle("Titolo2","Questo è il mio secondo articolo","http://","Gli Stati Uniti/Il michigan","description","keywords");
         */
         AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(Context.class);
         JoomlaJavaApi joomlaJavaApi=applicationContext.getBean(JoomlaJavaApi.class);
         joomlaJavaApi.createCategory("ee/tt/yy");
         joomlaJavaApi.createCategory("ee/tt/yt");
     }

    @org.junit.Test
    public void testMenuDao() throws Exception, GenericErrorException {
        /*JoomlaJavaApi app = new JoomlaJavaApi();
        //    app.createCategory("Gli Stati Uniti/Il Michigan/I palazzi");
        app.createCategory("Viaggi in sud america/Peru/Lima"); */

    }
}
