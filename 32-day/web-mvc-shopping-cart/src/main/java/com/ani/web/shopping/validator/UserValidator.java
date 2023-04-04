package com.ani.web.shopping.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ani.web.shopping.entity.User;

public class UserValidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;

        if(user.getId() <=0 ) errors.rejectValue("id", "user.id", "user id must be positive");
    }
}
