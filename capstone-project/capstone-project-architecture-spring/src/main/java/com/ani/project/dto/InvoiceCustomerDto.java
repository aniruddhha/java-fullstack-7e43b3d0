package com.ani.project.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class InvoiceCustomerDto {
    private String client;
    private LocalDate invDt;
    private Double amt;
    private Long customerId;
}
