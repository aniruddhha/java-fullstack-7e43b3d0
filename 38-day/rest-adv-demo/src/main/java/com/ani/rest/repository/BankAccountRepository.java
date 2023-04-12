package com.ani.rest.repository;

import com.ani.rest.domain.BankAccount;

public interface BankAccountRepository {
    
    BankAccount save(BankAccount account);
}
