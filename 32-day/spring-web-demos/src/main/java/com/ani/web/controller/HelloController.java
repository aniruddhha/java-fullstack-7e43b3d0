package com.ani.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    
    @GetMapping("/hlo")
    public String sayHello(Model model) {
        model.addAttribute("name", "abc");
        return "hello";
    }
}
