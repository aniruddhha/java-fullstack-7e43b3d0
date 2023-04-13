package com.ani.basicauth.controller;

import java.time.LocalDate;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.basicauth.domain.Invoice;

@RequestMapping(value = "/user")
@RestController
public class UserController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Invoice> checkInvoice() {
        return ResponseEntity.ok().body(
            new Invoice(22L, "abc" ,LocalDate.of(2000, 01, 01), 899.50d)
        );
    }
    
}
