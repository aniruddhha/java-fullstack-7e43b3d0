package com.ani.rest.controller;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.rest.dto.AppResponse;
import com.ani.rest.dto.BankAccountDto;
import com.ani.rest.service.BankAccountService;

import lombok.AllArgsConstructor;

@RequestMapping(value = "/accounts")
@AllArgsConstructor
@RestController
public class BankAccountController {

    private final BankAccountService service; // constructor injection had happened because lombk have created paramaterized constructor   

    @GetMapping(value = "/")
    public ResponseEntity<BankAccountDto> accountDetails() {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(new BankAccountDto(12L,"abc",34.89d));
    }

    @GetMapping(value = "/links")
    public EntityModel<AppResponse<String>> accountDetails2() {
      
        Link selfLink = linkTo(methodOn(BankAccountController.class).accountDetails2())
                        .withSelfRel();

        Link withdarwLink = linkTo(methodOn(BankAccountController.class).accountDetails())
                            .withRel("withdraw");
        
        Link depositLink = linkTo(methodOn(BankAccountController.class).accountDetails2())
                            .withRel("deposit");

        AppResponse<String> response = AppResponse.<String>builder()
                                        .bd("links")
                                        .sts("information")
                                        .msg("imp links")
                                        .build();

        return EntityModel.of(response, selfLink, withdarwLink, depositLink);
    }
}
