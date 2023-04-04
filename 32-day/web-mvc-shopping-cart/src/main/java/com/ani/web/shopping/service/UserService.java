package com.ani.web.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.web.shopping.db.UserDb;
import com.ani.web.shopping.entity.User;

@Service
public class UserService {

    @Autowired
    private UserDb userDb;
    
    public Integer createNewUser(User user) {

        userDb.getUsers().add(user);

        return 1;
    }

    public List<User> listAllUsers() {
        return userDb.getUsers();
    }
}
