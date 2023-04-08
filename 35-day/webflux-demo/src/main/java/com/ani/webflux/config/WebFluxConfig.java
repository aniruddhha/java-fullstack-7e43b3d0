package com.ani.webflux.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.ani.webflux.controller.OtherItemHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import javax.print.attribute.standard.Media;



@Configuration
public class WebFluxConfig {

    @Bean
    public RouterFunction<ServerResponse> routerFunction(OtherItemHandler handler) {
        return RouterFunctions.route()
                                .GET("/other/", handler::read)
                                .POST("/post/", accept(MediaType.APPLICATION_JSON), handler::create)
                                .PUT("/update/", handler::update)
                                .DELETE("/delete/", handler::delete)
                                .build();
    }
}
