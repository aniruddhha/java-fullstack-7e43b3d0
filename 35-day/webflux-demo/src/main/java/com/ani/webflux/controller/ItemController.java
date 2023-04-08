package com.ani.webflux.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.webflux.domain.Item;
import com.ani.webflux.dto.AppRes;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping(value = "/item")
@RestController
public class ItemController {

    private final Map<Long, Item> items = new HashMap<>();

    // POST - http://localhost:8080/item/
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<AppRes>> create(@RequestBody Item item) {
        Objects.requireNonNull(item);
        items.put(item.getId(), item);

        return Mono.just(
                ResponseEntity.status(HttpStatus.CREATED)
                        .body(new AppRes("success", "Item Created Successfully")));
    }

    // GET - http://localhost:8080/item/
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Item> read() {
        return Flux.fromIterable(items.values());
    }

    // PUT - http://localhost:8080/item/
    @PutMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<AppRes>> update(@RequestBody Item newItem) {
        Objects.requireNonNull(newItem);

        return Mono.justOrEmpty(items.get(newItem.getId()))
                .map(existingItem -> {
                    existingItem.setName(newItem.getName());
                    existingItem.setCategory(newItem.getCategory());
                    existingItem.setPrice(newItem.getPrice());

                    items.put(newItem.getId(), existingItem);

                    return ResponseEntity.status(HttpStatus.ACCEPTED)
                            .body(new AppRes("success", "Item updated successfully"));
                })
                .defaultIfEmpty(
                        ResponseEntity.status(HttpStatus.NOT_FOUND).body(new AppRes("fail", "not able to update"))
                );

    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<AppRes>> delete(@PathVariable Long id) {
        items.remove(id);

        return Mono.just(ResponseEntity.status(HttpStatus.OK).body(new AppRes("success", "Item deleted successfully")));
    }

    // 1 truck sends 3 records in 1 sec -> in 1 min how records 1 truck sends ?
    // 1 min = 180
    // 1 hour = 180 * 60 = ~11000
    // 1000 trucks will send = ~1,10,00,000 requests per hour
}
