package com.ani.project.service;

import java.util.List;

import com.ani.project.dto.InvoiceDto;
import com.ani.project.exception.InvoiceNotFoundException;

public interface InvoiceService {
    
    Integer createNewInvoice(InvoiceDto invoice);

    List<InvoiceDto> all();

    Integer deleteInvoice(Long id) throws InvoiceNotFoundException;

    InvoiceDto fetchInvoiceDetails(Long id) throws InvoiceNotFoundException;

    Integer updateInvoice(InvoiceDto invoice);
}
