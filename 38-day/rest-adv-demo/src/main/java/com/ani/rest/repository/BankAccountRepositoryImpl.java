package com.ani.rest.repository;

import org.springframework.stereotype.Repository;

import com.ani.rest.domain.BankAccount;

@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository{
    @Override
    public BankAccount save(BankAccount account) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}
