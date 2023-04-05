package com.ani.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello") // http://localhost:8080/hello
@Controller
public class HelloController {
    
    @GetMapping("/") // GET - http://localhost:8080/hello/
    public String show() {
        return "hello";
    }
}
