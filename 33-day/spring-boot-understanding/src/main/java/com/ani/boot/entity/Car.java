package com.ani.boot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Car {
    private Long id;
    private String make;
    private String model;
}
