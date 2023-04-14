package com.ani.project.service;

import org.springframework.stereotype.Service;

import com.ani.project.dto.InvoiceDto;
import com.ani.project.repository.InvoiceRepository;
import com.ani.project.util.InvoiceMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository repository;
    private final InvoiceMapper mapper;
    
    @Override
    public Integer createNewInvoice(InvoiceDto dto) {
        repository.save(mapper.toDomain(dto));
        return 1;
    }
}
