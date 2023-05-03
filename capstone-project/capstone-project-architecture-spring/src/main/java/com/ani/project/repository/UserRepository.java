package com.ani.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.project.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    Optional<User> findByUserNameAndPassword(String userName, String password);
}
