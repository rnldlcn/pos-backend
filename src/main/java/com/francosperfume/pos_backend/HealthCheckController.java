package com.francosperfume.pos_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HealthCheckController {
  @GetMapping("/api/status")
    public String healthCheck(){
    return "POS Backend is running!";
}
}