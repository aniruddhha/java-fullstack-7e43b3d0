package com.ani.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.mapping.domain.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
