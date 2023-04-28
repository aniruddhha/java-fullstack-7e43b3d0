package com.ani.project.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ani.project.domain.Invoice;
import com.ani.project.dto.InvoiceDto;
import com.ani.project.exception.InvoiceNotFoundException;
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

    @Override
    public Integer deleteInvoice(Long id) {
        repository.deleteById(id);
        return 1;
    }

    @Override
    public InvoiceDto fetchInvoiceDetails(Long id) {
        Optional<Invoice> op = repository.findById(id);
        return mapper.toDto(op.orElseThrow(() -> new InvoiceNotFoundException("Invoice " + id + " Not Found")));
    }

    @Override
    public Integer updateInvoice(InvoiceDto invoice) {
        repository.save(mapper.toDomain(invoice));
        return 1;
    }
}
