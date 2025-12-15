package com.example.task4;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/q7")
public class Q7_CustomStatusController {

    // 7. Return custom HTTP status codes from a REST API.

    @GetMapping("/custom")
    public ResponseEntity<String> getCustomStatus() {
        return new ResponseEntity<>("This is a generic Created (201) response!", HttpStatus.CREATED);
    }
}
