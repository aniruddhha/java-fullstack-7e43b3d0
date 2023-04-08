package com.ani.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ani.webflux.demo.ReactiveComponents;

@SpringBootApplication
public class WebfluxDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(WebfluxDemoApplication.class, args);

		ReactiveComponents cp =  ctx.getBean(ReactiveComponents.class);
		cp.monoFluxDemo1();
	}

}
