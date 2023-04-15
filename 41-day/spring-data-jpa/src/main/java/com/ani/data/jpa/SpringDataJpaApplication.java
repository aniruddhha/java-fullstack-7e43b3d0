package com.ani.data.jpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.ani.data.jpa.domain.Mobile;
import com.ani.data.jpa.domain.Product;
import com.ani.data.jpa.repo.ProductRepository;
import com.ani.data.jpa.repo.ProductSpecifications;
import com.ani.data.jpa.repo.SimpleJpaRepo;
import com.ani.data.jpa.service.ProductService;

@EnableJpaAuditing
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

	public static void demo4(SimpleJpaRepo repo) {
		Optional<Mobile> op1 = repo.findByNumberAndLat("1607092591", 17.90f);
		Mobile mob1 = op1.orElseThrow(() -> new RuntimeException("Invalid Mobile Number"));
		System.out.println(mob1);
	}

	public static void demo5(SimpleJpaRepo repo) {
		repo.custSave(99L, "9999", 18.90f, 72.90f);
	}

	public static void demo6(ProductRepository repo) {
		List<Product> products1 = repo.findAll(ProductSpecifications.hasNameContaining("Pi"));
		products1.forEach(System.out::println);
	}

	public static void demo7(ProductRepository repo) {
		Specification<Product> spec = Specification
		.where(ProductSpecifications.hasNameContaining("ac"))
		.and(ProductSpecifications.hasPriceLessThan(89d));

		List<Product> products = repo.findAll(spec);
		products.forEach(System.out::println);
	}

	public static void demo8(ProductService service) {
		// service.customMethod(3);
		service.customUpadte(8);
	}

	public static void demo9(ProductRepository repository) {

		Product product = new Product();
		product.setName("nnn");
		product.setCategory("mmm");
		product.setPrice(7.8d);
		
		repository.save(product);
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataJpaApplication.class, args);

		// Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println); 
			demo9(ctx.getBean(ProductRepository.class));
		// demo8(ctx.getBean(ProductService.class));
	}

}
