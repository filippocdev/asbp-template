package com.example.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @GetMapping("/test")
    public String getTest(@RequestParam String param) {
        return new String("TEST");
    }

}
