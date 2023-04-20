package com.ani.docker.springdockerdemo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Simple {
    private Long id;
    private String name;
    private LocalDate ld;
}
