package com.ani.project.util;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.stereotype.Component;

import com.ani.project.domain.Invoice;
import com.ani.project.dto.InvoiceDto;

@Component
public class InvoiceMapper {
    
    public Invoice toDomain(InvoiceDto dto) {
        return new Invoice(dto.getId(), dto.getClient(), dto.getInvDt(), dto.getAmt());
    }

    public InvoiceDto toDto(Invoice domain) {
        return new InvoiceDto(domain.getId(), domain.getClient(), domain.getInvDt(), domain.getAmt());
    }
}
