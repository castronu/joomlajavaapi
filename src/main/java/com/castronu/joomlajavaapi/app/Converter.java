package com.castronu.joomlajavaapi.app;

public class Converter{
    public static String getPath(String categoryPath){
        return categoryPath.replaceAll(" ", "-").toLowerCase();

    }
    public static String getTitle(String categoryPath){
        String[] splittedPath = categoryPath.split("/");
        int level = splittedPath.length;
        return splittedPath[level - 1];
    }
    public static String getAlias(String categoryPath){
        String[] splittedPath = categoryPath.split("/");
        int level = splittedPath.length;
        return splittedPath[level - 1].replaceAll(" ","-").toLowerCase();
    }

}
