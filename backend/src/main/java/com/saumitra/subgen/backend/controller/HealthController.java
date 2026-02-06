package com.saumitra.subgen.backend.controller;

import com.saumitra.subgen.backend.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final HealthService healthService;
    public HealthController(HealthService healthService){
        this.healthService = healthService;
    }

    @GetMapping("/health")
    public String healthController(){
        return healthService.healthMessage();
    }

    @GetMapping("/hello")
    public String helloController(){
        return healthService.helloMessage();
    }
}
