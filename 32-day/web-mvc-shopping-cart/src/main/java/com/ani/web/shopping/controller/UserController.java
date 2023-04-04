package com.ani.web.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ani.web.shopping.entity.User;
import com.ani.web.shopping.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/") // POST - http://localhost:8080/user/
    public String createNewUser(@ModelAttribute("user") User user ) {

        userService.createNewUser(user);

        return "success";
    }

    @GetMapping("/")  // GET - http://localhost:8080/user/
    public String listUsers(Model model) {
        model.addAttribute("users", userService.listAllUsers());
        return "users";
    }
}
