package com.ani.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/cart")
@RestController // i will not resolve the views
public class CartController {
 
    @GetMapping(value = "/")
    public String check() {
        return "hello";
    }
}
