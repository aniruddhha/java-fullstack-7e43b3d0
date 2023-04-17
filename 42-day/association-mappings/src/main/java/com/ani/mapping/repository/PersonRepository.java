package com.ani.mapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.mapping.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
    
    @Override
    List<Person> findAll();
}
