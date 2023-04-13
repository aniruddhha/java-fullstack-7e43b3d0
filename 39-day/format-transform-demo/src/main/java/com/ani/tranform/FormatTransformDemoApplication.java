package com.ani.tranform;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

import javax.xml.bind.JAXBException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;

import com.ani.tranform.domain.Author;
import com.ani.tranform.domain.Book;
import com.ani.tranform.domain.Publisher;
import com.ani.tranform.xml.Converter;

@SpringBootApplication
public class FormatTransformDemoApplication {

	public static void main(String[] args) throws JAXBException, IOException {
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
		book.setAuthor(author);
		book.setPublisher(publisher);
		book.setPublishedDate(LocalDate.now());

		try {
			converter.toXml(book);
		} catch (JAXBException e) {
			e.printStackTrace();
		}


		Resource res = new ClassPathResource("book.xml");
		Book bk = converter.toDomain(res.getFile());
		System.out.println(bk);
	}

}
