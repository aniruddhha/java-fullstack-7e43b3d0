package com.ani.basicauth.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Invoice {
    private Long invNum;
    private String clNm;
    private LocalDate invDt;
    private Double amt;
}
