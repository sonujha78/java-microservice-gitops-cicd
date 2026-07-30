package com.keenable.javamicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
            "message", "Hello from Java Microservice!",
            "service", "java-microservice",
            "timestamp", LocalDateTime.now().toString()
        );
    }

    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of("status", "UP", "version", "1.0.0");
    }
}
