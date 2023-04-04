package com.ani.web.shopping.db;

import java.util.ArrayList;
import java.util.List;

import com.ani.web.shopping.entity.User;

public class UserDb {
    
    private final List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }
}
