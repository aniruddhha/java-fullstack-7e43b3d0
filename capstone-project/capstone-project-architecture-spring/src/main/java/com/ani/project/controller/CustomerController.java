package com.ani.project.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.project.dto.CustomerCreateDto;
import com.ani.project.dto.CustomerListDto;
import com.ani.project.service.CustomerService;

import lombok.AllArgsConstructor;

@CrossOrigin
@AllArgsConstructor
@RequestMapping(value = "/customer")
@RestController
public class CustomerController {

    private final CustomerService service;

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> createCustomer(@RequestBody CustomerCreateDto dto) {
        final Integer sts = service.createCustomer(dto);
        return ResponseEntity.ok().body(sts);
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CustomerListDto>> findAll() {
        return ResponseEntity.ok().body(service.findCustomers());
    }

    @GetMapping(value = "/{ss}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CustomerListDto>> findAllContaining(@PathVariable String ss) {
        return ResponseEntity.ok().body(service.findCustomers(ss));
    }
}
