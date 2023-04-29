package com.ani.project.service;

import java.util.List;

import com.ani.project.dto.CustomerCreateDto;
import com.ani.project.dto.CustomerListDto;

public interface CustomerService {
    
    // you need to create custom exceptions
    Integer createCustomer(CustomerCreateDto dto);

    List<CustomerListDto> findCustomers();

    List<CustomerListDto> findCustomers(String ss);

}
