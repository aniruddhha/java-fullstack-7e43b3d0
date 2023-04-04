package com.ani.web.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ani.web.entity.User;

@RequestMapping("/user")
@Controller
public class UserController {
    
    private final List<User> users = Arrays.asList(
        new User(11, "abc"),
        new User(12, "pqr"),
        new User(13, "lmn"),
        new User(14, "xyz"),
        new User(15, "tuv")
    );

    @GetMapping("/one/{id}")
    public String findUser(@PathVariable Integer id, Model model) {

        User user = users.stream()
            .filter(us -> Objects.equals(us.getId(), id))
            .collect(Collectors.toList())
            .get(0);

        model.addAttribute("usNm", user.getName());

        return "user";
    }
}
