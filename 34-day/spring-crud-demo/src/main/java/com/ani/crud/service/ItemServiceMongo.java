package com.ani.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ani.crud.domain.Item;

@Service
public class ItemServiceMongo implements ItemService {

    @Override
    public Integer create(Item item) {
        return 0;
    }

    @Override
    public List<Item> readAll() { 
        return new ArrayList<>();
    }

    @Override
    public Integer update(Item item) {
        return 0;
    }

    @Override
    public Integer delete(Long id) {
        return 0;
    }
}
