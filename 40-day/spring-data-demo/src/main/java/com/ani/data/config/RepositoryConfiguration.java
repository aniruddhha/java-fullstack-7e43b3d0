package com.ani.data.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// as we use spring boot, we dont need this, spring boot data starter does this automaticaly
// @EnableJpaRepositories("com.ani.data.repository")
@Configuration
public class RepositoryConfiguration {
    
}
