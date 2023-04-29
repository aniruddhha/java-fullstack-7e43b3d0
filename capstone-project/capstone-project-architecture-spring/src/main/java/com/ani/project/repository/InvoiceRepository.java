package com.ani.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.project.domain.Invoice;


public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    // https://stackoverflow.com/questions/55579240/spring-data-find-by-property-of-a-nested-object
    List<Invoice> findByCustomer_Id(Long id);
}
