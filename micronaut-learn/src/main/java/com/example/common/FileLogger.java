package com.example.common;

import io.micronaut.context.annotation.Primary;
import jakarta.inject.Singleton;

@Singleton
@Primary
public class FileLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.print("FILE:" + message);
    }
}
