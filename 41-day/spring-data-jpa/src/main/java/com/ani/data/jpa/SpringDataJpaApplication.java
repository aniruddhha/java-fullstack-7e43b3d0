package com.ani.data.jpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ani.data.jpa.domain.Mobile;
import com.ani.data.jpa.repo.SimpleJpaRepo;

@SpringBootApplication
public class SpringDataJpaApplication {


	public static void demo1(SimpleJpaRepo repo) {

		List<Mobile> mobiles = repo.findByNumberContaining("88");
		mobiles.forEach(System.out::println);

		System.out.println(repo.count());
	}

	public static void demo2(SimpleJpaRepo repo) {

		List<Mobile> mobiles1 = repo.findAllJPQL();
		mobiles1.forEach(System.out::println);

		List<Mobile> mobiles2 = repo.findAllSQL();
		mobiles2.forEach(System.out::println);
	}

	public static void demo3(SimpleJpaRepo repo) {
		Optional<Mobile> op1 = repo.findOneWithMobile1("1607092591");
		Mobile mob1 = op1.orElseThrow(() -> new RuntimeException("Invalid Mobile Number"));
		System.out.println(mob1);

		Optional<Mobile> op2 = repo.findOneWithMobile2("1607092591");
		Mobile mob2 = op2.orElseThrow(() -> new RuntimeException("Invalid Mobile Number"));
		System.out.println(mob2);

		Optional<Mobile> op3 = repo.findOneWithMobile3("1607092591");
		Mobile mob3 = op3.orElseThrow(() -> new RuntimeException("Invalid Mobile Number"));
		System.out.println(mob3);
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataJpaApplication.class, args);

		// Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println); 
		demo3(ctx.getBean(SimpleJpaRepo.class));
	}

}
