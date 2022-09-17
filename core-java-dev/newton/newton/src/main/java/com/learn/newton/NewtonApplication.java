package com.learn.newton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
public class NewtonApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewtonApplication.class, args);
        // set the config
        // class path scan -> annotations
        // apache tomcat
    }

}
