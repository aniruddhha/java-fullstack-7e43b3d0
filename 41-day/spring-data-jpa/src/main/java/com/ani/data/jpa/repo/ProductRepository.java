package com.ani.data.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.data.jpa.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { 
    
    List<Product> findAll(Specification<Product> specs);
}
