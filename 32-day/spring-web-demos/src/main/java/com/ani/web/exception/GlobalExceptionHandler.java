package com.ani.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler({ UserNotFoundException.class })
    public String handleAllExceptions() {
        return "fail";
    }
}
