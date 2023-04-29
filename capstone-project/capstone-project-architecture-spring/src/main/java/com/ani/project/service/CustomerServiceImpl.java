package com.ani.project.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ani.project.domain.Customer;
import com.ani.project.dto.CustomerCreateDto;
import com.ani.project.dto.CustomerListDto;
import com.ani.project.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@Transactional
@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    
    @Override
    public Integer createCustomer(CustomerCreateDto dto) {
        
        // do not write this conversion code here, kindly create seperate mapper class
        // existining mapper can be modified and make it dynamic
        Customer customer = new Customer();
        customer.setDob(dto.getDob());
        customer.setIsActive(dto.getIsActive());
        customer.setMobile(dto.getMobile());
        customer.setName(dto.getName());

        customerRepository.save(customer);
        
        return 1;
    }

    @Override
    public List<CustomerListDto> findCustomers() {
        return customerRepository.findAll()
                            .stream()
                            .map(domain -> new CustomerListDto(domain.getId(), domain.getName(), domain.getMobile()))
                            .collect(Collectors.toList());
    }

    @Override
    public List<CustomerListDto> findCustomers(String ss) {
        return customerRepository.findByMobileContaining(ss)
        .stream()
        .map(domain -> new CustomerListDto(domain.getId(), domain.getName(), domain.getMobile()))
        .collect(Collectors.toList());
    }
}
