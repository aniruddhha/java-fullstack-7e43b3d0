package com.ani.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.project.domain.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long>{
    
}
