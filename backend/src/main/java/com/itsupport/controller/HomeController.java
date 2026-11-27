
package com.itsupport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/welcome")
    public Map<String, String> welcome() {

        return Map.of(
            "project", "GenAI IT Support Platform",
            "message", "Backend is running successfully!",
            "version", "1.0.0"
        );
    }
}
