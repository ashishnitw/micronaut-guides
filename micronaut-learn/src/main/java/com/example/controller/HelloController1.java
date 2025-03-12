package com.example.controller;

import com.example.common.Logger;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Named;

@Controller
public class HelloController1 {

    private final Logger logger;

    public HelloController1(@Named("File") Logger logger) {
        this.logger = logger;
    }

    @Get("/hello")
    public String hello() {
        logger.log("Get hello request");
        return "Hello World!";
    }
}
