package com.ani.project.service;

import java.util.List;

import com.ani.project.dto.InvoiceCustomerDto;
import com.ani.project.dto.InvoiceDto;
import com.ani.project.exception.CustomerNotFoundException;
import com.ani.project.exception.InvoiceNotFoundException;

public interface InvoiceService {
    
    Integer createNewInvoice(InvoiceDto invoice);

    Integer createNewInvoice(InvoiceCustomerDto dto);

    List<InvoiceDto> all();

    Integer deleteInvoice(Long id) throws InvoiceNotFoundException;

    InvoiceDto fetchInvoiceDetails(Long id) throws InvoiceNotFoundException;

    Integer updateInvoice(InvoiceDto invoice);

    List<InvoiceDto> allCustomerInvoices(Long id) throws CustomerNotFoundException;
}
