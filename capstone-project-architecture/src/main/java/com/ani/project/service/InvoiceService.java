package com.ani.project.service;

import org.springframework.transaction.annotation.Transactional;

import com.ani.project.dto.InvoiceDto;

public interface InvoiceService {
    
    Integer createNewInvoice(InvoiceDto invoice);
}
