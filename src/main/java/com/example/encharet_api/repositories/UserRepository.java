package com.example.encharet_api.repositories;

import com.example.encharet_api.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
