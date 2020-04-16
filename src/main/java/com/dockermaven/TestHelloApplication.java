package com.dockermaven;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
public class TestHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestHelloApplication.class, args);
    }

}
