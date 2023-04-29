package com.ani.project.util;

import org.springframework.stereotype.Component;

import com.ani.project.domain.Invoice;
import com.ani.project.dto.InvoiceDto;

@Component
public class InvoiceMapper {
    
    public Invoice toDomain(InvoiceDto dto) {

        return Invoice.builder()
                        .amt(dto.getAmt())
                        .client(dto.getClient())
                        .id(dto.getId())
                        .invDt(dto.getInvDt())
                        .build();
    }

    public InvoiceDto toDto(Invoice domain) {
        return new InvoiceDto(domain.getId(), domain.getClient(), domain.getInvDt(), domain.getAmt());
    }
}
