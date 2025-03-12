package com.example.service;

import com.example.exceptions.UserNotFoundException;
import com.example.model.User;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class UserService {

    private List<User> users = new ArrayList<>();

    public User createUser(User user) {
        users.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUser(int id) {
        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException());
    }

    public void deleteUser(int id) {
        User user = getUser(id);
        users.remove(user);
    }
}
