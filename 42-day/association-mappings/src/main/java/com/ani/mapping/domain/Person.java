package com.ani.mapping.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;
    private String name;
    private LocalDate dob;

}

// one person can have one unique identity
// one identity can belongs to one person

/* 
 
    create table person (
       person_id bigint not null,
        dob date,
        name varchar(255),
        primary key (person_id)
    ) engine=InnoDB

*/
