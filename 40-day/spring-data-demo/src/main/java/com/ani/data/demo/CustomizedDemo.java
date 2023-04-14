package com.ani.data.demo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
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

    public void demo5() {
        System.out.println("🟢 Limit and Order By 🟢");
        List<Invoice> invoices1 = repository.findTop10ByOrderByAmtDesc();
        invoices1.forEach(System.out::println);

        System.out.println("🟢 Like And Sort 🟢");
        List<Invoice> invoices2 = repository.findByClientLike("%a%", Sort.by(Direction.DESC,"client"));
        invoices2.forEach(System.out::println);

        System.out.println("🟢 Containing 🟢");
        List<Invoice> invoices3 = repository.findByClientContainingOrderByClientDesc("a");
        invoices3.forEach(System.out::println);

        System.out.println("🟢 Pagination 🟢");

        System.out.println("📝 Page 1, 5 Invoices");
        Page<Invoice> page1 = repository.findAll(PageRequest.of(0, 5));
        page1.forEach(System.out::println);

        System.out.println("📝 Page 2, 5 Invoices");
        Page<Invoice> page2 = repository.findAll(PageRequest.of(1, 5));
        page2.forEach(System.out::println);

        System.out.println("📝 Page 3, 5 Invoices");
        Page<Invoice> page3 = repository.findAll(PageRequest.of(2, 5));
        page3.forEach(System.out::println);

    }
}
