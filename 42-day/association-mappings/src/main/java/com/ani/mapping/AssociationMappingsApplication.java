package com.ani.mapping;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ani.mapping.domain.Person;
import com.ani.mapping.repository.PersonRepository;
import com.ani.mapping.service.PersonService;

@SpringBootApplication
public class AssociationMappingsApplication {

	public static void demo1(PersonService personService) {

		personService.insertPerson("Alice", LocalDate.of(1995, 5, 15), "Driver's License", false, "9876543210", "alice@example.com");
		personService.insertPerson("Bob", LocalDate.of(1988, 11, 2), "Passport", true, "5554443333", "bob@example.com");
		personService.insertPerson("Cathy", LocalDate.of(1992, 3, 20), "ID Card", true, "9998887777", "cathy@example.com");
		personService.insertPerson("David", LocalDate.of(1985, 8, 12), "Passport", false, "3332221111", "david@example.com");
		personService.insertPerson("Emily", LocalDate.of(1998, 12, 31), "Driver's License", true, "7776665555", "emily@example.com");


		// List<Person> persons = repository.findAll();
		// persons.forEach(System.out::println);

	}

	public static void demo2(PersonService personService) {
		personService.insertPersonOnly("Jack", LocalDate.of(1998, 6, 15));
	}

	public static void demo3(PersonService personService) {
		personService.addContactDetails(16, "55555555", "jacksprrow@34.com");
		personService.addContactDetails(16, "11111111", "jacksprrow@37.com");
		personService.addContactDetails(16, "22222222", "jacks@37.com");
	}

	

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(AssociationMappingsApplication.class, args);
		PersonService personService = ctx.getBean(PersonService.class);

		demo3(personService);

	}

}
