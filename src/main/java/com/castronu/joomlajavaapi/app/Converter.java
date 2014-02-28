package com.castronu.joomlajavaapi.app;

public class Converter{
    static String getPath(String categoryPath){
        return categoryPath.replaceAll(" ", "-").toLowerCase();

    }
    static String getTitle(String categoryPath){
        String[] splittedPath = categoryPath.split("/");
        int level = splittedPath.length;
        return splittedPath[level - 1];
    }
    static String getAlias(String categoryPath){
        String[] splittedPath = categoryPath.split("/");
        int level = splittedPath.length;
        return splittedPath[level - 1].replaceAll(" ","-").toLowerCase();
    }

}
