package com.dev.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String sayHello() {
        return "Hello How are you? !!!";
    }

    @RequestMapping("/howareyou")
    public String sayFile() {
        return "I'm Doing good";
    }


}
