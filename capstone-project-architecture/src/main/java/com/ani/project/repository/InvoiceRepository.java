package com.ani.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.project.domain.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    
}
