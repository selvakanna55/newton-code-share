package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    String hello() {
        return "Hello";
    }


    @GetMapping("/hello_world")
    String helloWorld() {
        return "Hello World";
    }
}
