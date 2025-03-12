package com.example;

import com.example.controller.HelloController;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
public class HelloControllerTest {

    @Inject
    private HelloController helloController;

    @Test
    void shouldLogToFile() {
        helloController.hello();
    }
}
