package com.example.prac1206.repository;

import com.example.prac1206.domain.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findByUserId(String userId);
}
