package com.ani.web.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ani.web.entity.User;

@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
      return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
      User user = (User) target;

      if(user.getId() <= 0) {
        errors.rejectValue("id","error.id", "Id must be positive");
      }
      if(user.getName().length() == 0) {
        errors.rejectValue("name","error.name", "Name is rquired");
      }
      if( user.getMobile().length() != 10) {
        errors.rejectValue("mobile","error.mobile", "Mobile must be 10 digits long");
      }
    }
    
}
