package com.castronu.joomlajavaapi.utils;

import com.castronu.joomlajavaapi.domain.Category;
import com.castronu.joomlajavaapi.domain.Content;
import org.apache.commons.lang.WordUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
//Refactor...
public class JoomlaDslUtils {
    public static Category sanytize(Category category) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (Field field : Category.class.getDeclaredFields()) {
            if (field.getType() == Timestamp.class) {
                Method method = Category.class.
                        getDeclaredMethod("set" + WordUtils.capitalize(field.getName()), Timestamp.class);
                method.invoke(category, new Timestamp(0l));
            }
        }
        return category;
    }

    public static Content sanytize(Content category) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (Field field : Category.class.getDeclaredFields()) {
            if (field.getType() == Timestamp.class) {
                Method method = Content.class.
                        getDeclaredMethod("set" + WordUtils.capitalize(field.getName()), Timestamp.class);
                method.invoke(category, new Timestamp(0l));
            }
        }
        return category;
    }
}