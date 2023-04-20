package com.ani.docker.springdockerdemo;

import java.time.LocalDate;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/simple")
@RestController
public class SimpleController {
    
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Simple> get() {
        return ResponseEntity.ok()
                            .body(
                                new Simple(
                                    10L, 
                                    "abc", 
                                    LocalDate.now()
                                )
                            );
    }
}
