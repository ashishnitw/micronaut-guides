package com.example;

import com.example.controller.HelloController2;
import com.example.controller.HelloController3;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
public class HelloControllerTest3 {

    @Inject
    private HelloController3 helloController;

    @Test
    void shouldLogToFile() {
        helloController.hello();
    }
}
