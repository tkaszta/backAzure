package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/viragok")
    public String home() {
        return "Hello from Azure App Service alma (in the staging slot)!";
    }
}
