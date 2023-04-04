package com.ani.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hi")
@Controller
public class HiController {
    
    @GetMapping("/sayHi")
    public String hi() {
        return "hi";
    }
}
