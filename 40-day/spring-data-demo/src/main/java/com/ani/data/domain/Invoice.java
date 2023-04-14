package com.ani.data.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity // table
public class Invoice {

    @Id // primary key
    @Column(name = "id")
    private Long id;

    @Column(name = "client")
    private String client;

    @Column(name = "invDt")
    private LocalDate invDt; // inv_dt

    @Column(name = "amt")
    private Double amt;
}
/*
    CREATE TABLE invoice (
        id BIGINT NOT NULL,
        client VARCHAR(255),
        inv_dt DATE,
        amt DOUBLE,
        PRIMARY KEY (id)
    );
*/

