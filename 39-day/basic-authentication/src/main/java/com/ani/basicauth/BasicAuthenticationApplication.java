package com.ani.basicauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BasicAuthenticationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BasicAuthenticationApplication.class, args);

		PasswordEncoder encoder = ctx.getBean(PasswordEncoder.class);
		System.out.println("-----------------------");
		System.out.println(encoder.encode("123"));

	}

}
