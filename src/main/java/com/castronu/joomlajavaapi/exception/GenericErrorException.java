package com.castronu.joomlajavaapi.exception;

import org.apache.commons.lang.exception.ExceptionUtils;

/**
 * Created with IntelliJ IDEA.
 * User: diegocastronuovo
 * Date: 13/04/13
 * Time: 02:16
 * To change this template use File | Settings | File Templates.
 */
public class GenericErrorException extends Throwable {

    private String message;
    private Throwable e;

    public GenericErrorException(String message) {
        this.message = message;
    }

    public GenericErrorException(String s, Throwable e) {
        this.message= s+"\n"+ExceptionUtils.getFullStackTrace(e);
    }

    public String getMessage() {
        return message;
    }
}
