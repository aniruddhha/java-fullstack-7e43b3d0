package com.ani.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.ani.project.domain.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    
}
