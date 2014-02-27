package com.castronu.joomladsl;

import com.castronu.joomladsl.app.App;
import com.castronu.joomladsl.exception.GenericErrorException;
import org.apache.commons.lang.WordUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 20/04/13
 * Time: 17:47
 * To change this template use File | Settings | File Templates.
 */
public class WikiTest {
    /*Trying to get info from wikipedia
    @org.junit.Test
    public void test() throws Exception, GenericErrorException {
        String[] listOfTitleStrings = { "El Pais" };

        User user = new User("", "", "http://es.wikipedia.org/w/api.php");
        user.login();
        List<Page> listOfPages = user.queryContent(listOfTitleStrings);
        System.out.println(listOfPages.size());
        for (Page page : listOfPages) {
            if (page.getCurrentRevision().getContent().contains("REDIRECT")) {
                System.out.println(page.getCurrentRevision().getContent());
                String newLing=page.getCurrentRevision().getContent().replace("#REDIRECT [[", "");
                String newString=newLing.replace("]]", "");
                List<Page> pages = user.queryContent(Arrays.asList(newString));
                Page page1 = pages.get(0);
                WikiModel wikiModel = new WikiModel("${image}", "${title}");
                System.out.println(wikiModel.render(page1.toString()));

                break;
            }
            WikiModel wikiModel = new WikiModel("${image}", "${title}");

            String html = wikiModel.render(page.toString());


            System.out.println(html);
        }

    }   */

}
