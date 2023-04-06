package com.ani.crud.service;

import java.util.List;

import com.ani.crud.domain.Item;

public interface ItemService {
    
    Integer create(Item item);

    List<Item> readAll();

    Integer update(Item item);

    Integer delete(Long id);
}
