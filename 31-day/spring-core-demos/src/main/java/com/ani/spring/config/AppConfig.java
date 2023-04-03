package com.ani.spring.config;

import java.io.File;

import org.springframework.context.annotation.Bean;

import com.ani.spring.util.FileChecker;
import com.ani.spring.util.FileUtil;

public class AppConfig {
   
    @Bean
    public FileUtil util() {
        return new FileUtil();
    }

    @Bean
    public FileChecker checker(FileUtil util) {
        return new FileChecker(util);
    }
}
