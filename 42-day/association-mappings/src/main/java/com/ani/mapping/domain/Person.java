package com.ani.mapping.domain;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Setter
@Getter
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;
    private String name;
    private LocalDate dob;

    // bi-directional
    @OneToOne(mappedBy = "person", fetch = FetchType.LAZY) // when select fired, do not select all records from identity
    private IdentityDoc identityDoc;

    @OneToMany(mappedBy = "person", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ContactDetails> contactDetails;

}

// one person can have one unique identity
// one identity can belongs to one person
// bi-directionality is an optional, depnds on business need

/* 
 
    create table person (
       person_id bigint not null,
        dob date,
        name varchar(255),
        primary key (person_id)
    ) engine=InnoDB

*/
