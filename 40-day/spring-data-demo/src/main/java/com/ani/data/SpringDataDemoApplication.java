package com.ani.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ani.data.demo.CustomizedDemo;

@SpringBootApplication
public class SpringDataDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataDemoApplication.class, args);

		CustomizedDemo demo = ctx.getBean(CustomizedDemo.class);
		demo.demo5();
	}

}
