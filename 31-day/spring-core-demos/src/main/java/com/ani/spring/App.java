package com.ani.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ani.spring.config.AppConfig;
import com.ani.spring.excel.XlConfig;
import com.ani.spring.util.FileChecker;
import com.ani.spring.util.FileUtil;

public final class App {

    public static void normal() {
        System.out.println("🔥 Providing Dependencies Normally 🔥");

        FileUtil util = new FileUtil();

        FileChecker checker = new FileChecker(util);
        checker.checkFileValidity();
    }

    public static void withSpringJavaConfig() {
        System.out.println("🔥 Providing Dependencies With Java Code 🔥");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        String[] names = ctx.getBeanDefinitionNames();
        for(String nm : names) {
            System.out.println(" 👉 "+nm);
        }

        FileChecker checker = ctx.getBean(FileChecker.class);
        checker.checkFileValidity();
    }

    public static void withSpringXmlConfig() {
        System.out.println("🔥 Providing Dependencies With Xml Config 🔥");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        FileChecker checker = ctx.getBean(FileChecker.class);
        checker.checkFileValidity();
    }

    public static void withSpringAnnotationConfig() {
        System.out.println("🔥 Providing Dependencies With Annotation Config 🔥");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(XlConfig.class, AppConfig.class);

        String[] names = ctx.getBeanDefinitionNames();
        System.out.println(Arrays.toString(names));
    }

    public static void main(String[] args) {
        withSpringAnnotationConfig();
    }
}
