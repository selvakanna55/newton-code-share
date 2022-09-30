package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    String hello() {
        return "Hello World. How are you?";
    }

    @RequestMapping("/namstea")
    String namstea() {
        return "namstea";
    }
}


