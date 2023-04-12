package com.ani.rest.util;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.ani.rest.domain.BankAccount;
import com.ani.rest.dto.BankAccountDto;

@Component
public class DmDtConverter {
    
    public BankAccount toDomain(BankAccountDto dto) {
        return new BankAccount(dto.getId(), dto.getOwner(), dto.getBalance(), LocalDate.now());
    }

    public BankAccountDto toDto(BankAccount account) {
        return new BankAccountDto(account.getId(), account.getOnwer(), account.getBalance());
    }
}
