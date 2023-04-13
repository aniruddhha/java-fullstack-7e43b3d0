package com.ani.tranform.domain;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.ani.tranform.xml.LocalDateAdapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    private String title;
    private String isbn;
    
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate publishedDate;
    private String genre;

    @XmlElement(name = "author")
    private Author author;

    @XmlElement(name = "publisher")
    private Publisher publisher;
}




