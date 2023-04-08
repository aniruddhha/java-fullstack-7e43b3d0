package com.ani.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;

@RestController
public class RangeController {
    
    @GetMapping(value = "/numbers")
    public Flux<Integer> generateNumbers() {
        return Flux.range(1, 100) // Publisher emits 1 to 10
                //    .log() // Log each event for demonstration purposes
                   .map( i -> i * 2) // // Processor multiplies each number by 2
                   .doOnRequest(n -> System.out.println("Requesting " + n +" items")) // Log number of requested items
                   .doOnNext(n -> System.out.println("Processing " + n)) // // Log each processed item
                   .limitRate(3); // // Backpressure: limit rate to 3 items per second

    }

    @GetMapping(value = "/numbers/v2")
    public Flux<Integer> generateNumbersv2() {

        Flux<Integer> flx = Flux.range(1, 100) // Publisher emits 1 to 10
        //    .log() // Log each event for demonstration purposes
           .map( i -> i * 2) // // Processor multiplies each number by 2
           .doOnRequest(n -> System.out.println("Requesting " + n +" items")) // Log number of requested items
           .doOnNext(n -> System.out.println("Processing " + n)) // // Log each processed item
           .limitRate(3); // Backpressure: limit rate to 3 items per second
        
        Disposable disp = flx.subscribe();

        return flx;
    }

}
