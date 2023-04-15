package com.ani.data.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.ani.data.jpa.domain.Product;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class ProductService {

    private final ProductRepository repository;
    
    public List<Product> combined(String name, Double price) {

         Specification<Product> spec = Specification
                .where(ProductSpecifications.hasNameContaining(name))
                .and(ProductSpecifications.hasPriceLessThan(price));

         return repository.findAll(spec);
    }
}
