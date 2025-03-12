package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import io.micronaut.core.async.annotation.SingleResult;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller("/users")
public class UserController {

    @Inject
    private UserService userService;

    @Get("/")
    @SingleResult // Use this annotation for single results (Mono)
    public Flux<User> getUsers() {
        return userService.getUsers(); // Return the stream of items
    }

    @Get("/{id}")
    @SingleResult // Use this annotation for single results (Mono)
    public Mono<User> getUser(@PathVariable String id) {
        return userService.getUserById(id); // Return a single item
    }
}
