package com.example;

import com.example.controller.UserController;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;

@MicronautTest
public class UserControllerTest {

    @Inject
    private UserController userController;

}
