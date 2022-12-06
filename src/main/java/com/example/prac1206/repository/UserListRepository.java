package com.example.prac1206.repository;

import com.example.prac1206.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserListRepository implements UserRepository{
    private List<User> users;

    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }

    @Override
    public Optional<User> findByUserId(String userId) {
        for (User user: users) {
            if (user.getUserId() == userId) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
