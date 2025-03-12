package com.example.common;

import io.micronaut.context.annotation.Secondary;
import jakarta.inject.Singleton;

@Singleton
@Secondary
public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.print("CONSOLE:" + message);
    }
}
