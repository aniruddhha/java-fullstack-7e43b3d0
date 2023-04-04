package com.ani.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/req")
@Controller
public class ReqController {
    
    @GetMapping("/") // http://localhost:8080/req/
    // @RequestMapping(method = RequestMethod.GET)
    public String getImage() {
        return "hi";
    }

    @PostMapping("/new") // http://localhost:8080/req/new
    // @RequestMapping(method = RequestMethod.POST)
    public String saveImage() {
        return "success";
    }

    @PutMapping("/update") // http://localhost:8080/req/update
    // @RequestMapping(method = RequestMethod.PUT)
    public String updateImage() {
        return "success";
    }

    @DeleteMapping("/delete") // http://localhost:8080/req/delete
    // @RequestMapping(method = RequestMethod.DELETE)
    public String deleteImage() {
        return "success";
    }
}
