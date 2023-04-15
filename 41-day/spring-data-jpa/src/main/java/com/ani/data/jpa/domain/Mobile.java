package com.ani.data.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Data;

@NamedQuery(
    name = "Mobile.findByNumberAndLat",
    query = "select m from Mobile m where m.number = :mobile and m.latitude = :lat"
)
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
