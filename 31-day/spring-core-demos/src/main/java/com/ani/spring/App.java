package com.ani.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ani.spring.config.AppConfig;
import com.ani.spring.util.FileChecker;
import com.ani.spring.util.FileUtil;

public final class App {

    public static void normal() {
        FileUtil util = new FileUtil();

        FileChecker checker = new FileChecker(util);
        checker.checkFileValidity();
    }

    public static void withSpring() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        FileChecker checker = ctx.getBean(FileChecker.class);
        checker.checkFileValidity();
    }

    public static void main(String[] args) {
        withSpring();
    }
}
