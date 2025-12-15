package com.example.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/q4")
public class Q4_FetchByIdController {

    // 4. Implement a REST API to fetch a record by ID.
    // 5. Create a custom exception for data not found (Used here).

    @Autowired
    private StudentRepository repository;

    @GetMapping("/students/{id}")
    public Student getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new Q5_DataNotFoundException("Student not found with id: " + id));
    }
}
