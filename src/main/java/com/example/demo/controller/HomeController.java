package com.example.demo.controller;

import com.example.demo.model.Flower;
import com.example.demo.model.FlowerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    private FlowerRepository flowerRepository;

    public HomeController(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

//    @PostMapping("/viragok")
//    public Flower getFlower(@RequestBody Flower flower) {
//        return flowerRepository.save(flower);
//    }

    @GetMapping("/viragok")
    public List<Flower> home() {
        return flowerRepository.findAll();
    }
}
