package com.ani.shopping.exception;

public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException(String message) {
        super(message);
    }
}
