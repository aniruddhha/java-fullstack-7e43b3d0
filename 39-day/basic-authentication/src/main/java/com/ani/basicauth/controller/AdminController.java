package com.ani.basicauth.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.basicauth.domain.Invoice;

@RequestMapping(value = "/admin")
@RestController
public class AdminController {
    
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Invoice>> invoices() {

        List<Invoice> invs = new ArrayList<>();
        invs.add(new Invoice(1L, "abc", LocalDate.now(), 56789d));
        invs.add(new Invoice(2L, "pqr", LocalDate.of(2000, 01, 01), 656d));
        return ResponseEntity.ok().body(invs);
    } 
}
