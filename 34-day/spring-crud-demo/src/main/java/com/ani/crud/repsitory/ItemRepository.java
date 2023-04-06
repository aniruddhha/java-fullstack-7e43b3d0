package com.ani.crud.repsitory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ani.crud.domain.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, Long> {
    
}
