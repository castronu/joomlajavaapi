package com.castronu.joomladsl.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import com.castronu.joomladsl.app.App;
import com.castronu.joomladsl.exception.GenericErrorException;

public class AppTest {
	 @org.junit.Test
	    public void testApp() throws Exception, GenericErrorException {
            App app = new App();
        //    app.createCategory("Gli Stati Uniti/Il Michigan/I palazzi");
         app.createCategory("Gli Stati Uniti/Il michigan");

	    }

    @org.junit.Test
    public void testMenuDao() throws Exception, GenericErrorException {
        App app = new App();
        //    app.createCategory("Gli Stati Uniti/Il Michigan/I palazzi");
        app.createCategory("Viaggi in sud america/Peru/Lima");

    }
}
