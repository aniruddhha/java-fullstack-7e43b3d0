package com.ani.data.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.ani.data.domain.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    
}
