package com.ani.project.controller;


import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.project.dto.AppResponse;
import com.ani.project.dto.InvoiceDto;
import com.ani.project.service.InvoiceService;

import lombok.AllArgsConstructor;

@CrossOrigin
@AllArgsConstructor
@RequestMapping(value = "/invoice")
@RestController
public class InvoiceController {

    private final InvoiceService service;
    
    @CrossOrigin
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> createNewInvoice(@RequestBody InvoiceDto dto) {

        final Integer sts = service.createNewInvoice(dto);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                                                    .sts("success")
                                                    .msg("Invoice Created Successfully")
                                                    .bd(sts)
                                                    .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<List<InvoiceDto>>> allInvoices() {
        List<InvoiceDto> invoices = service.all();

        AppResponse<List<InvoiceDto>> response = AppResponse.<List<InvoiceDto>>builder()
                                                            .sts("success")
                                                            .msg("Invoices")
                                                            .bd(invoices)
                                                            .build();

        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> deleteInvoice(@PathVariable Long id) {

        final Integer sts = service.deleteInvoice(id);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
            .sts("success")
            .msg("Invoice Deleted Successfully")
            .bd(sts)
            .build();

        return ResponseEntity.status(200).body(response);
    }
}
