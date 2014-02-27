package com.castronu.joomladsl.app;

import com.castronu.joomladsl.app.Converter;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 14/04/13
 * Time: 02:22
 * To change this template use File | Settings | File Templates.
 */
public class ConverterTest {



    @Test
    public void testGetPath() throws Exception {
        String categoryPath="I viaggi/In Italia";
        assertThat(Converter.getPath(categoryPath),is("i-viaggi/in-italia"));
        assertThat(Converter.getAlias(categoryPath),is("in-italia"));
        assertThat(Converter.getTitle(categoryPath),is("In Italia"));

        String categoryPath2="I viaggi/In italia/Nella nostra Liguria";
        assertThat(Converter.getPath(categoryPath2),is("i-viaggi/in-italia/nella-nostra-liguria"));
        assertThat(Converter.getTitle(categoryPath2),is("Nella nostra Liguria"));
        assertThat(Converter.getAlias(categoryPath2),is("nella-nostra-liguria"));

    }

    @Test
    public void testGetTitle() throws Exception {

    }

    @Test
    public void testGetAlias() throws Exception {

    }
}
