package com.ani.reactive.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ReactiveMongoDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ReactiveMongoDemoApplication.class, args);

		ItemRepository repository = ctx.getBean(ItemRepository.class);
		
		Item item = new Item(10L, "abc", "aaa", 456.90);

		repository.save(item)
				.doOnNext( savedItem -> System.out.println(savedItem) )
				.doOnError(err -> System.out.println(err))
				.subscribe();

	}

}
