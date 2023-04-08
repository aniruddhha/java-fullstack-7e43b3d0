package com.ani.webflux.demo;

import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ReactiveComponents {
    
    public void monoDemo1() {

        Mono<String> mono1 =  Mono.just("Hello");
        Mono<String> mono2 = mono1.doOnNext( str -> System.out.println("---->"+str));
        mono2.subscribe();
    }

    public void monoDemo2() {

       Mono.just("Hello")
            .doOnNext(str -> System.out.println("---->"+str))
            .subscribe();
      
    }


    public void fluxDemo1() {
        Flux<Integer> flux1 =  Flux.fromArray(new Integer[] {1, 2, 3, 4, 5});
        Flux<Integer> flux2 = flux1.doOnNext( el -> System.out.println("-------> " + el) );
        flux2.subscribe();
    }

    public void fluxDemo2() {
        Flux.fromArray(new Integer[] {1, 2, 3, 4, 5})
        .doOnNext( el -> System.out.println("-------> " + el) )
        .subscribe();
    }

    public void monoFluxDemo1() {

        Integer[] arr = new Integer[] {1, 2, 3, 4, 5};

        Mono.just(arr)
        .doOnNext(str -> System.out.println("Mono ---->"+str))
        .subscribe();

        Flux.fromArray(arr)
        .doOnNext( el -> System.out.println("Flux -------> " + el) )
        .subscribe();
    }
}
