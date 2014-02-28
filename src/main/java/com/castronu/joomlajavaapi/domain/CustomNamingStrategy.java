package com.castronu.joomlajavaapi.domain;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.hibernate.cfg.ImprovedNamingStrategy;

public class CustomNamingStrategy extends ImprovedNamingStrategy {

    private static final long serialVersionUID = 1L;
    private String prefix;

    public CustomNamingStrategy(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String classToTableName(final String className) {
        return this.addPrefix(super.classToTableName(className));
    }

    private String addPrefix(final String composedTableName) {

        return prefix
                + "_" + pluralize(composedTableName).toLowerCase();

    }

    private String pluralize(String word) {
        if (word.endsWith("y")) {
            return StringUtils.substring(word, 0, word.length() - 1) + "ies";
        } else if (word.equals("menu")) {return word;   //Ugly but the name of that table is different
        } else if (word.equals("content")) return word;    //Ugly but the name of that table is different
        else return word + "s";
    }

}