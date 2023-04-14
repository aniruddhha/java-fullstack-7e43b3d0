package com.ani.data.demo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.ani.data.domain.Invoice;
import com.ani.data.domain.repository.InvoiceCustomizedRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class CustomizedDemo {

    private final InvoiceCustomizedRepository repository;

    public void demo1() {
        List<Invoice> invoices = repository.findAll();
        invoices.forEach(System.out::println);
    }

    public void demo2() {
        // find all customer who are having name abc
        List<Invoice> invoices = repository.findAll();
       
        List<Invoice> filtered = invoices.stream()
                                    .filter( inv -> inv.getClient().equals("abc") )
                                    .collect(Collectors.toList());
        System.out.println(filtered);
    }

    public void demo3() {
        System.out.println("🟢 Client Name 🟢");
        List<Invoice> invoices1 = repository.findByClient("abc");
        invoices1.forEach(System.out::println);

        System.out.println("🟢 Greater Than 🟢");
        List<Invoice> invoices2 = repository.findByAmtGreaterThan(780d);
        invoices2.forEach(System.out::println);
    }

    public void demo4() {
        System.out.println("🟢 Between 🟢");
        List<Invoice> invoices1 = repository.findByInvDtBetween(
            LocalDate.of(2023, 04, 02),
            LocalDate.of(2023, 04, 10) 
        );
        invoices1.forEach(System.out::println);

        System.out.println("🟢 Between And 🟢");
        List<Invoice> invoices2 = repository.findByInvDtBetweenAndAmtGreaterThan(
            LocalDate.of(2023, 04, 02),
            LocalDate.of(2023, 04, 10),
            780d 
        );
        invoices2.forEach(System.out::println);
    }
}
