package com.ani.data.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ani.data.jpa.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { 
    
    List<Product> findAll(Specification<Product> specs);

    @Transactional
    @Modifying
    @Query(value = "delete from product where id = :id", nativeQuery = true)
    void deleteCustom(@Param("id") Long id);
}
