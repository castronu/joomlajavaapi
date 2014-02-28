package com.castronu.joomlajavaapi.dao;

import com.castronu.joomlajavaapi.app.JoomlaJavaApi;
import com.castronu.joomlajavaapi.domain.Category;
import org.junit.Ignore;

import static com.castronu.joomlajavaapi.builder.CategoryBuilder.aCategoryWithPath;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 02:44
 * To change this template use File | Settings | File Templates.
 */
@Ignore("To refactor")
public class CategoryDaoTest {
    @org.junit.Test
    public void testGetDefaultCategory() throws Exception {
        Category defaultCategory = aCategoryWithPath("Barcelona", "Barcelona", "catalunia/barcelona");
        assertThat(defaultCategory.getLevel(),is(2));
        assertThat(defaultCategory.getTitle(),is("Barcelona"));
        assertThat(defaultCategory.getAlias(),is("Barcelona"));
        assertThat(defaultCategory.getPath(),is("catalunia/barcelona"));
    }

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
    }
}
