package com.castronu.joomlajavaapi.exception;

/**
 * Created with IntelliJ IDEA.
 * User: castronu
 * Date: 03/03/14
 * Time: 17:29
 * To change this template use File | Settings | File Templates.
 */
public class CategoryAlreadyExistException extends Throwable {

    private String category;

    public CategoryAlreadyExistException(String category){
        this.category=category;
    }

    public String getCategory(){
        return category;
    }

}
