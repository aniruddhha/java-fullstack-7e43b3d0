package com.ani.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.mapping.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
