package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/users")
public class UserController {

    @Inject
    private UserService userService;

    @Post
    public HttpResponse<User> createUser(@Body User user) {
        return HttpResponse.created(userService.createUser(user));
    }

    @Get
    public HttpResponse<List<User>> getAllUser() {
        return HttpResponse.ok().body(userService.getAllUsers());
    }

    @Get("/{id}")
    public HttpResponse<User> getUser(@PathVariable int id) {
        return HttpResponse.ok().body(userService.getUser(id));
    }

    @Delete("/{id}")
    public HttpResponse<User> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return HttpResponse.ok();
    }

}
