package com.example.demo.controller;

import com.example.demo.model.FlowerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private FlowerRepository flowerRepository;

    public HomeController(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    @GetMapping("/viragok")
    public String home() {
        return "Hello from Azure App Service szija Bigyoooo!";
    }
}
