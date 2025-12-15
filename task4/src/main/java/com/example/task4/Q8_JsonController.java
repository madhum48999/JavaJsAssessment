package com.example.task4;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/q8")
public class Q8_JsonController {

    // 8. Create a REST API that accepts and returns JSON data.
    // Spring Boot uses Jackson by default to handle JSON.

    @PostMapping("/echo")
    public Map<String, Object> echoJson(@RequestBody Map<String, Object> payload) {
        payload.put("status", "processed");
        return payload;
    }
}
