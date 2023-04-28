package com.ani.project.exception;

public class InvoiceNotFoundException extends RuntimeException {
    public InvoiceNotFoundException(String msg) {
        super(msg);
    }    
}
