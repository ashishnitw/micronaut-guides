package com.example;

import com.example.controller.HelloController1;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
public class HelloControllerTest1 {

    @Inject
    private HelloController1 helloController;

    @Test
    void shouldLogToFile() {
        helloController.hello();
    }
}
