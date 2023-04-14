package com.ani.project.service;

import com.ani.project.dto.InvoiceDto;

public interface InvoiceService {
    
    Integer createNewInvoice(InvoiceDto invoice);
}
