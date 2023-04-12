package com.ani.rest.service;

import org.springframework.stereotype.Service;

import com.ani.rest.domain.BankAccount;
import com.ani.rest.repository.BankAccountRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor // to enable constructor injection
@Service
public class BankAccountServiceImpl implements BankAccountService{

    private final BankAccountRepository repository;

    @Override
    public Integer createNewAccount(BankAccount account) {
        repository.save(account);
        return 0;
    }
}
