package com.ani.project.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ani.project.dto.InvoiceDto;
import com.ani.project.repository.InvoiceRepository;
import com.ani.project.util.InvoiceMapper;

import lombok.AllArgsConstructor;

@Transactional
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

    @Override
    public List<InvoiceDto> all() {
        return repository.findAll()
                        .stream()
                        // .map( invoice -> mapper.toDto(invoice) )
                        .map(mapper::toDto)
                        .collect(Collectors.toList());
    }
}
