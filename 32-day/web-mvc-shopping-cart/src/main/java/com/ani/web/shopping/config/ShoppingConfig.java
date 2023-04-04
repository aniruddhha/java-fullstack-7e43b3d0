package com.ani.web.shopping.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ani.web.shopping.db.UserDb;

@Configuration
public class ShoppingConfig {
    
    @Bean
    public UserDb userDb() {
        return new UserDb();
    }
}
