package com.example.task4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.SQLException;

@RestController
@RequestMapping("/api/q10")
public class Q10_DatabaseErrorController {

    // 10. Handle database errors using simple exception handling.
    // The handling logic is in Q6_GlobalExceptionHandler.java using
    // @ExceptionHandler.
    // This controller simulates a database error.

    @GetMapping("/error")
    public void triggerDbError() throws SQLException {
        throw new SQLException("Simulated Database Connection Error");
    }
}
