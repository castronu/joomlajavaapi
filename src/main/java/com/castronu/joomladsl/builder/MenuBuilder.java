package com.castronu.joomladsl.builder;

import com.castronu.joomladsl.domain.Menu;

import java.sql.Timestamp;

public class MenuBuilder {
        private Menu menu;

        private MenuBuilder() {
            menu = new Menu();
        }

        public MenuBuilder withId(int id) {
            menu.setId(id);
            return this;
        }

        public MenuBuilder withMenutype(String menutype) {
            menu.setMenutype(menutype);
            return this;
        }

        public MenuBuilder withTitle(String title) {
            menu.setTitle(title);
            return this;
        }

        public MenuBuilder withAlias(String alias) {
            menu.setAlias(alias);
            return this;
        }

        public MenuBuilder withNote(String note) {
            menu.setNote(note);
            return this;
        }

        public MenuBuilder withPath(String path) {
            menu.setPath(path);
            return this;
        }

        public MenuBuilder withLink(String link) {
            menu.setLink(link);
            return this;
        }

        public MenuBuilder withType(String type) {
            menu.setType(type);
            return this;
        }

        public MenuBuilder withPublished(byte published) {
            menu.setPublished(published);
            return this;
        }

        public MenuBuilder withParentId(int parentId) {
            menu.setParentId(parentId);
            return this;
        }

        public MenuBuilder withLevel(int level) {
            menu.setLevel(level);
            return this;
        }

        public MenuBuilder withComponentId(int componentId) {
            menu.setComponentId(componentId);
            return this;
        }

        public MenuBuilder withCheckedOut(int checkedOut) {
            menu.setCheckedOut(checkedOut);
            return this;
        }

        public MenuBuilder withCheckedOutTime(Timestamp checkedOutTime) {
            menu.setCheckedOutTime(checkedOutTime);
            return this;
        }

        public MenuBuilder withBrowserNav(byte browserNav) {
            menu.setBrowserNav(browserNav);
            return this;
        }

        public MenuBuilder withAccess(int access) {
            menu.setAccess(access);
            return this;
        }

        public MenuBuilder withImg(String img) {
            menu.setImg(img);
            return this;
        }

        public MenuBuilder withTemplateStyleId(int templateStyleId) {
            menu.setTemplateStyleId(templateStyleId);
            return this;
        }

        public MenuBuilder withParams(String params) {
            menu.setParams(params);
            return this;
        }

        public MenuBuilder withLft(int lft) {
            menu.setLft(lft);
            return this;
        }

        public MenuBuilder withRgt(int rgt) {
            menu.setRgt(rgt);
            return this;
        }

        public MenuBuilder withHome(byte home) {
            menu.setHome(home);
            return this;
        }


    
        public MenuBuilder withLanguage(String language) {
            menu.setLanguage(language);
            return this;
        }

        public MenuBuilder withClientId(byte clientId) {
            menu.setClientId(clientId);
            return this;
        }

        public static MenuBuilder menu() {
            return new MenuBuilder();
        }

        public Menu build() {
            return menu;
        }
    private static Menu aMenu(String title, String alias, String path,int parentId) {
        MenuBuilder menuBuilder = new MenuBuilder();
        String[] splittedPath = path.split("/");
        int level = splittedPath.length;
        byte published=1;
        byte browsnav=0;
        byte home=0;
        byte clientId=0;
        return menuBuilder.withMenutype("mainmenu").withNote("").withType("component").
                withPublished(published).withComponentId(22).withCheckedOut(0).
                withBrowserNav(browsnav).withAccess(1).withImg("").
                withTemplateStyleId(0).
                withParams("{\"show_category_title\":\"\",\"show_description\":\"\",\"show_description_image\":\"\",\"maxLevel\":\"\",\"show_empty_categories\":\"\",\"show_no_articles\":\"\",\"show_subcat_desc\":\"\",\"show_cat_num_articles\":\"\",\"page_subheading\":\"\",\"show_pagination_limit\":\"\",\"filter_field\":\"\",\"show_headings\":\"\",\"list_show_date\":\"\",\"date_format\":\"\",\"list_show_hits\":\"\",\"list_show_author\":\"\",\"orderby_pri\":\"\",\"orderby_sec\":\"\",\"order_date\":\"\",\"show_pagination\":\"\",\"show_pagination_results\":\"\",\"display_num\":\"10\",\"show_title\":\"\",\"link_titles\":\"\",\"show_intro\":\"\",\"show_category\":\"\",\"link_category\":\"\",\"show_parent_category\":\"\",\"link_parent_category\":\"\",\"show_author\":\"\",\"link_author\":\"\",\"show_create_date\":\"\",\"show_modify_date\":\"\",\"show_publish_date\":\"\",\"show_item_navigation\":\"\",\"show_vote\":\"\",\"show_readmore\":\"\",\"show_readmore_title\":\"\",\"show_icons\":\"\",\"show_print_icon\":\"\",\"show_email_icon\":\"\",\"show_hits\":\"\",\"show_noauth\":\"\",\"show_feed_link\":\"\",\"feed_summary\":\"\",\"menu-anchor_title\":\"\",\"menu-anchor_css\":\"\",\"menu_image\":\"\",\"menu_text\":1,\"page_title\":\"\",\"show_page_heading\":0,\"page_heading\":\"\",\"pageclass_sfx\":\"\",\"menu-meta_description\":\"\",\"menu-meta_keywords\":\"\",\"robots\":\"\",\"secure\":0}")
        .withLft(11).withRgt(12).withHome(home).withLanguage("*").withClientId(clientId).
                withTitle(title).withAlias(alias).withPath(path).
                        withLevel(level).
                withParentId(parentId).build();
    }

    public static Menu aMenuCategory(String title, String alias, String path, int categoryId, int parentId) {
        Menu menu = aMenu(title, alias, path, parentId);
        menu.setLink("index.php?option=com_content&view=category&id=" + categoryId);
        return menu;
    }

    public static Menu aMenuArticle(String title, String alias,String path, int articleId, int parentId) {
        Menu menu = aMenu(title, alias, path, parentId);
        menu.setLink("index.php?option=com_content&view=article&id=" + articleId);
        return menu;


    }

}

/*
Menu{id=157, menutype='mainmenu', title='Catalunia', alias='catalunia', note='', path='catalunia', link='index.php?option=com_content&view=category&id=15', 
        type='component', published=1, parentId=1, level=1, componentId=22, checkedOut=0, checkedOutTime=null, browserNav=0, access=1, img='', templateStyleId=0, params='{"show_category_title":"","show_description":"","show_description_image":"","maxLevel":"","show_empty_categories":"","show_no_articles":"","show_subcat_desc":"","show_cat_num_articles":"","page_subheading":"","show_pagination_limit":"","filter_field":"","show_headings":"","list_show_date":"","date_format":"","list_show_hits":"","list_show_author":"","orderby_pri":"","orderby_sec":"","order_date":"","show_pagination":"","show_pagination_results":"","display_num":"10","show_title":"","link_titles":"","show_intro":"","show_category":"","link_category":"","show_parent_category":"","link_parent_category":"","show_author":"","link_author":"","show_create_date":"","show_modify_date":"","show_publish_date":"","show_item_navigation":"","show_vote":"","show_readmore":"","show_readmore_title":"","show_icons":"","show_print_icon":"","show_email_icon":"","show_hits":"","show_noauth":"","show_feed_link":"","feed_summary":"","menu-anchor_title":"","menu-anchor_css":"","menu_image":"","menu_text":1,"page_title":"","show_page_heading":0,"page_heading":"","pageclass_sfx":"","menu-meta_description":"","menu-meta_keywords":"","robots":"","secure":0}', lft=143, rgt=148, home=0, language='*', clientId=0}
        lft=143, rgt=148, home=0, language='*', clientId=0}
    */
