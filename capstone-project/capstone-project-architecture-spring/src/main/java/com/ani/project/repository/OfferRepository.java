package com.ani.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.project.domain.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {
    
}
