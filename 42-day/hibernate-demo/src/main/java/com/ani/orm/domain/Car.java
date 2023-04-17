package com.ani.orm.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "car_info")
public class Car {

    @Id
    private Long id;
    private String name;
    private Double cost;
}
