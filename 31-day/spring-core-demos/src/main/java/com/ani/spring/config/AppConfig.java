package com.ani.spring.config;

import java.io.File;

import org.springframework.context.annotation.Bean;

import com.ani.spring.util.FileChecker;
import com.ani.spring.util.FileUtil;

public class AppConfig {
   
    @Bean // lifecyle of this FileUtil would be handled by spring IoC container
    public FileUtil util() {
        return new FileUtil();
    }

    @Bean // lifecyle of this FileChecker along with dependency FileUtil, would be handled by Spring IoC container
    public FileChecker checker(FileUtil util) {
        return new FileChecker(util);
    }
}
