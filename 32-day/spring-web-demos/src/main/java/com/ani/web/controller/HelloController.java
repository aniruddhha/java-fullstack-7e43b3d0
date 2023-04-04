package com.ani.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //specilized component used in web mvc, which plays role of controller
@RequestMapping("/demo") 
public class HelloController { // http://localhost:8080/demo
    
    @GetMapping("/hlo") 
    public String sayHello(Model model) { // http://localhost:8080/demo/hlo

        model.addAttribute("name", "abc");
        return "hello";
    }
    //   /WEB-INF/jsp/hello.jsp
}
