package com.ani.web.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ani.web.entity.User;
import com.ani.web.exception.UserNotFoundException;
import com.ani.web.service.UserService;
import com.ani.web.validation.UserValidator;

@RequestMapping("/user")
@Controller
public class UserController {
    
    @Autowired
    private UserValidator validator;

    private final List<User> users = Arrays.asList( // bad code
        new User(11, "abc", "982275245", "aa@bb.com"),
        new User(12, "pqr", "54543543", "cc@ww.com"),
        new User(13, "lmn", "43232344", "vv@ty.com"),
        new User(14, "xyz", "242536456" ,"mb@wt.com"),
        new User(15, "tuv", "16534126", "dd@ss.com")
    );

    @Autowired
    private UserService service; // good code

    @GetMapping("/one/{id}") // bad code
    public String findUser(@PathVariable Integer id, Model model) {

        User user = users.stream()
            .filter(us -> Objects.equals(us.getId(), id))
            .collect(Collectors.toList())
            .get(0);
        
        if(user == null) {
            throw new UserNotFoundException("User  " + id +" Not Found");
        }

        model.addAttribute("usNm", user.getName());

        return "user";
    }

    @GetMapping("/other/{id}") // good way
    public String findUserProfessional(@PathVariable Integer id, Model model) {

        // try {
        //     User user = service.findOne(id);
        //     model.addAttribute("usNm", user.getName());
        //     return "user";
        // } catch (Exception e) {
        //     return "fail";
        // }

            User user = service.findOne(id);
            model.addAttribute("usNm", user.getName());
            return "user";
    }

    @PostMapping("/create") // http://localhost:8080/user/create
    public ModelAndView createNewUser(@ModelAttribute("user") User user, BindingResult result) {

        validator.validate(user, result);

        if(result.hasErrors()) {
            ModelAndView mv = new ModelAndView("fail");
            mv.addObject("errors", result.getAllErrors());
            return mv;
        }


        ModelAndView mv = new ModelAndView("success");
        mv.addObject("usNm", user.getName());
        mv.addObject("mob", user.getMobile());
        mv.addObject("eml", user.getEmail());
        
        return mv;
    }

    @PostMapping("/createv2")
    public String createUserV2(@RequestParam Integer id, @RequestParam String name, @RequestParam String email, @RequestParam String mobile) {
        return "success";
    }

    @GetMapping("/show")
    public String showRegForm() {
        return "createuser";
    }

    @ExceptionHandler({ UserNotFoundException.class })
    public String handleAllExceptions() {

        return "fail";
    }
}
