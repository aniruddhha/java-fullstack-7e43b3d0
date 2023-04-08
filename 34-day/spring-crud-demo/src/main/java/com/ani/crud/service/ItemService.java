package com.ani.crud.service;

import java.util.List;

import com.ani.crud.domain.Item;
import com.ani.crud.exception.BadItemException;

public interface ItemService {
    
    Integer create(Item item) throws BadItemException;

    List<Item> readAll();

    Integer update(Item item);

    Integer delete(Long id);
}
