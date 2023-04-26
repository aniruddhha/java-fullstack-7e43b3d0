package com.ani.project.dto;


import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class InvoiceDto {
  
    private Long id;
   
    private String client;

    private LocalDate invDt; // inv_dt

    private Double amt;    
}
