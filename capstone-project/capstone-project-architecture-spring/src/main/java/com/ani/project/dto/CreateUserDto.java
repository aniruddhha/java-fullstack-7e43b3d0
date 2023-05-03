package com.ani.project.dto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CreateUserDto {

    @NotEmpty(message = "Username cant be empty")
    @NotNull(message = "Username cant be null")
    @NotBlank(message = "Username cant be blank")
    private String userName;

    @NotEmpty(message = "Password cant be empty")
    @NotNull(message = "Password cant be null")
    @NotBlank(message = "Password cant be blank")
    private String password;

    @NotEmpty(message = "role cant be empty")
    @NotNull(message = "role cant be null")
    @NotBlank(message = "role is mandetory")
    private String role;
}
