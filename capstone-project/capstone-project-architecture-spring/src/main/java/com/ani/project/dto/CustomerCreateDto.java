package com.ani.project.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CustomerCreateDto {
    private String name;
    private String mobile;
    private LocalDate dob;
    private Boolean isActive; 
}
