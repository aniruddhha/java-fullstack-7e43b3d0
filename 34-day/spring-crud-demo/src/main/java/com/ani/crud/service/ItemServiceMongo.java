package com.ani.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.crud.domain.Item;
import com.ani.crud.exception.BadItemException;
import com.ani.crud.repsitory.ItemRepository;

@Service
public class ItemServiceMongo implements ItemService {

    @Autowired
    private ItemRepository repository;

    @Override
    public Integer create(Item item) {

        if(Objects.isNull(item)) throw new BadItemException("Problem in Saving Item");

        repository.save(item);

        return 1;
    }

    @Override
    public List<Item> readAll() { 
        return repository.findAll();
    }

    @Override
    public Integer update(Item item) {
        repository.save(item);
        return 0;
    }

    @Override
    public Integer delete(Long id) {
        repository.deleteById(id);
        return 0;
    }
}
