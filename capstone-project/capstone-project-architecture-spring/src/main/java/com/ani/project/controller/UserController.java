package com.ani.project.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.project.dto.AppResponse;
import com.ani.project.dto.CreateUserDto;
import com.ani.project.dto.LoginDto;
import com.ani.project.dto.UserDto;
import com.ani.project.service.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping(value = "/user")
@RestController
public class UserController {
    
    private final UserService service;

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<AppResponse<Integer>> signup(@Valid @RequestBody CreateUserDto dto) {
        final Integer sts = service.signup(dto);

        AppResponse<Integer> res = AppResponse.<Integer>builder()
                                                .sts("success")
                                                .msg("User Created")
                                                .bd(sts)
                                                .build();

        return ResponseEntity.ok().body(res);
    }

    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<AppResponse<UserDto>> login(@Valid @RequestBody LoginDto dto) {
        final UserDto resDto = service.login(dto);

        AppResponse<UserDto> res = AppResponse.<UserDto>builder()
                                                .sts("success")
                                                .msg("Login Success")
                                                .bd(resDto)
                                                .build();

        return ResponseEntity.ok().body(res);
    }
}
