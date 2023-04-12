package com.ani.rest.util;

import org.springframework.stereotype.Component;

import com.ani.rest.domain.BankAccount;
import com.ani.rest.dto.BankAccountDto;

@Component
public class DmDtConverter {
    
    public BankAccount toDomain(BankAccountDto dto) {
        return new BankAccount();
    }

    public BankAccountDto toDto(BankAccount account) {
        return new BankAccountDto();
    }
}
