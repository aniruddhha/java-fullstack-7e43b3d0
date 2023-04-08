package com.ani.webflux.controller;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.ani.webflux.domain.Item;
import com.ani.webflux.dto.AppRes;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

@Component
public class OtherItemHandler {
    private final Map<Long, Item> items = new HashMap<>();

    public Mono<ServerResponse> create(ServerRequest request) {

        Mono<Item> itemMono = request.bodyToMono(Item.class);

        // map // Mono<Mono<Serverreponse>>>
        return itemMono.flatMap(item -> { // Mono<Serverreponse>>

            items.put(item.getId(), item);

            return ServerResponse.status(HttpStatus.CREATED)
                    .body(
                            Mono.just(new AppRes("success", "item created")),
                            AppRes.class);
        });
    }

    public Mono<ServerResponse> read(ServerRequest request) {
        Flux<Item> itemFlux = Flux.fromIterable(items.values());
        return ServerResponse.status(HttpStatus.OK).body(itemFlux, Item.class);
    }

    public Mono<ServerResponse> update(ServerRequest request) {

        Mono<Item> itemMono = request.bodyToMono(Item.class);

        return itemMono.flatMap(newItem -> {

            Item existingItem = items.get(newItem.getId());
            if (existingItem == null) {
                return ServerResponse.status(HttpStatus.NOT_FOUND)
                        .body(
                                Mono.just(new AppRes("fail", "Item Not Found")),
                                AppRes.class);
            }

            existingItem.setName(newItem.getName());
            existingItem.setCategory(newItem.getCategory());
            existingItem.setPrice(newItem.getPrice());

            items.put(newItem.getId(), existingItem);

            return ServerResponse.status(HttpStatus.ACCEPTED)
                    .body(
                            Mono.just(new AppRes("success", "Item updated successfully")),
                            AppRes.class);
        });
    }

    public Mono<ServerResponse> delete(ServerRequest request) {
        Long id = Long.valueOf(request.pathVariable("id"));

        items.remove(id);

        return ServerResponse.status(HttpStatus.OK)
                .body(
                        Mono.just(new AppRes("success", "Item deleted successfully")),
                        AppRes.class);
    }
}
