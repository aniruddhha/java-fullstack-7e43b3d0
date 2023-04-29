package com.ani.project.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Customer {

    @Id
    private Long id;
    private String name;
    private LocalDate dob;
    private Boolean isActive;

    @OneToMany(mappedBy = "customer" )
    private List<Invoice> invoices;
}
