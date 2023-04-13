package com.ani.tranform.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.ani.tranform.domain.Book;

@Component
public class Converter {

    private final JAXBContext context;

    public Converter() throws JAXBException {
        context = JAXBContext.newInstance(Book.class);
    }

    public void toXml(Book book) throws JAXBException {

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(book, System.out);
    }

    public Book toDomain(File xml) throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Book) unmarshaller.unmarshal(xml);
    }
}
