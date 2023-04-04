package com.ani.web.service;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ani.web.entity.User;
import com.ani.web.exception.UserNotFoundException;

@Service
public class UserService {

    private final List<User> users = Arrays.asList(
        new User(11, "abc", "982275245", "aa@bb.com"),
        new User(12, "pqr", "54543543", "cc@ww.com"),
        new User(13, "lmn", "43232344", "vv@ty.com"),
        new User(14, "xyz", "242536456" ,"mb@wt.com"),
        new User(15, "tuv", "16534126", "dd@ss.com")
    );

    public User findOne(Integer id) {

        List<User> usrs = users.stream()
        .filter(us -> Objects.equals(us.getId(), id))
        .collect(Collectors.toList());

        if(usrs.isEmpty()) {
            throw new UserNotFoundException("User  " + id +" Not Found");
        }

        return usrs.get(0);
    }
    
}
