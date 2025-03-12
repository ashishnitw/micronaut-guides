package com.example.controller;

import com.example.common.Console;
import com.example.common.Logger;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloController3 {

    private final Logger logger;

    public HelloController3(Logger logger) {
        this.logger = logger;
    }

    @Get("/hello")
    public String hello() {
        logger.log("Get hello request");
        return "Hello World!";
    }
}
