package com.example.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/q2")
public class Q2_SaveController {

    // 2. Create a REST API to save data into a database using JPA.

    @Autowired
    private StudentRepository repository;

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return repository.save(student);
    }
}
