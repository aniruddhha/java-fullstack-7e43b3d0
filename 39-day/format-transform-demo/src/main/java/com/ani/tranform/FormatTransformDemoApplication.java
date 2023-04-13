package com.ani.tranform;

import javax.xml.bind.JAXBException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ani.tranform.domain.Author;
import com.ani.tranform.domain.Book;
import com.ani.tranform.domain.Publisher;
import com.ani.tranform.xml.Converter;

@SpringBootApplication
public class FormatTransformDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FormatTransformDemoApplication.class, args);


		Converter converter = ctx.getBean(Converter.class);


		Author author = new Author();
		author.setFirstName("abc");
		author.setLastName("pqr");

		Publisher publisher = new Publisher();
		publisher.setLocation("london");
		publisher.setName("pub");

		Book book = new Book();
		book.setGenre("abc");
		book.setIsbn("6543gfh167245");
		book.setTitle("tuv");

		try {
			converter.toXml(book);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
