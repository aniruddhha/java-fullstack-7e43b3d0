package com.ani.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.mapping.domain.IdentityDoc;

public interface IdentityDocRepository extends JpaRepository<IdentityDoc, Long> {
    
}
