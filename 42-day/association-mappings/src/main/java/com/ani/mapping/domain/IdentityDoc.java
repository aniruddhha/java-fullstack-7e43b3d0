package com.ani.mapping.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
public class IdentityDoc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long docId;
    private String type;
    private Boolean isActive;

    @OneToOne(cascade = CascadeType.ALL) //  if you delete/update/insert/ record from identity table, concerned record in Person table will also be deleted
    @JoinColumn(name = "person_id")
    private Person person;
}

// one identity can belongs to one person
// one person can have one unique identity
/*
 
     create table identity_doc (
       doc_id bigint not null,
        is_active bit,
        type varchar(255),
        person_id bigint,
        primary key (doc_id)
    ) engine=InnoDB
   
    alter table identity_doc 
       add constraint FKtniq3yhdrxcnc08xyg37knag5 
       foreign key (person_id) 
       references person (person_id)
  
 */