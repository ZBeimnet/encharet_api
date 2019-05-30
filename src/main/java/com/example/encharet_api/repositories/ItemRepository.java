package com.example.encharet_api.repositories;

import com.example.encharet_api.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
