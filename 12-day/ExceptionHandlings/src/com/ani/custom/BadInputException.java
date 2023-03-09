package com.ani.custom;

public class BadInputException extends RuntimeException {

    private String field;

    public BadInputException(String message, String field) {
        super(message);
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
