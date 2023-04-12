package com.ani.rest.controller;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Media;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.rest.domain.BankAccount;
import com.ani.rest.dto.AppResponse;
import com.ani.rest.dto.BankAccountDto;
import com.ani.rest.service.BankAccountService;

import lombok.AllArgsConstructor;

@CrossOrigin
@AllArgsConstructor
@RequestMapping(value = "/atm")
@RestController
public class BankAtmController {
 
    private final BankAccountService service;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> create(@RequestBody BankAccountDto requestDto) {

        Integer st = service.createNewAccount(requestDto);


        AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("account created successfully")
                                                    .bd(st)
                                                    .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Collection<BankAccountDto>>> accounts() {

        Collection<BankAccountDto> accounts = service.listAllAccounts();
                                    

        AppResponse<Collection<BankAccountDto>> response = AppResponse.<Collection<BankAccountDto>>builder()
                                                                .sts("success")
                                                                .msg("all accounts")
                                                                .bd(accounts)
                                                                .build(); 

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
