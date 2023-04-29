package com.ani.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.project.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
    List<Customer> findByMobileContaining(String ss);
}
