package com.ani.data.jpa;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataJpaApplication.class, args);

		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println); 
	}

}
