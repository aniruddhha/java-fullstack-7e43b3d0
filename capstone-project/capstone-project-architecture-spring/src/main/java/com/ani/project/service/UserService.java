package com.ani.project.service;

import com.ani.project.dto.CreateUserDto;
import com.ani.project.dto.LoginDto;
import com.ani.project.dto.UserDto;
import com.ani.project.exception.UserNotFoundException;

public interface UserService {
    Integer signup(CreateUserDto dto);

    UserDto login(LoginDto dto) throws UserNotFoundException;
}
