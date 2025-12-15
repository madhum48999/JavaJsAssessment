package com.example.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/q3")
public class Q3_FetchAllController {

    // 3. Create a REST API to fetch all records from a database.

    @Autowired
    private StudentRepository repository;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}
