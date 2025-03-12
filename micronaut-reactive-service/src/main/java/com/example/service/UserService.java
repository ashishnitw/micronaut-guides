package com.example.service;

import com.example.model.User;
import jakarta.inject.Singleton;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Singleton
public class UserService {

    // Simulate a delayed operation returning a list of items (Flux)
    public Flux<User> getUsers() {
        return Flux.just(
                new User("1", "Mike"),
                new User("2", "Tom")
        ).delayElements(Duration.ofSeconds(1)); // Simulate a delay of 1 second for each item
    }

    // Simulate a delayed operation returning a single item (Mono)
    public Mono<User> getUserById(String id) {
        return Mono.just(new User(id, "User " + id))
                .delayElement(java.time.Duration.ofSeconds(2)); // Simulate a delay of 2 seconds
    }
}
