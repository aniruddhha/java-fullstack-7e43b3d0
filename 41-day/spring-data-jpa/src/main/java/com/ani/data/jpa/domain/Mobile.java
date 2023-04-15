package com.ani.data.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Mobile {

    @Id
    private Long id;

    @Column(name = "mob_num", unique = true, nullable = false)
    private String number;

    @Column(name = "lat")
    private Float latitude;

    @Column(name = "lng")
    private Float longitude;
}
