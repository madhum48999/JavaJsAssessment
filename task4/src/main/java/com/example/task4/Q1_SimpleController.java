package com.example.task4;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/q1")
public class Q1_SimpleController {

    // 1. Create a Spring Boot REST API with GET and POST methods.

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, this is a GET request!";
    }

    @PostMapping("/hello")
    public String receiveData(@RequestBody String data) {
        return "Received POST data: " + data;
    }
}
