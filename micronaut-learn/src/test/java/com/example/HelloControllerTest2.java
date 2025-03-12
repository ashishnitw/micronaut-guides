package com.example;

import com.example.controller.HelloController2;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
public class HelloControllerTest2 {

    @Inject
    private HelloController2 helloController;

    @Test
    void shouldLogToFile() {
        helloController.hello();
    }
}
