package com.bbva.ms_conversiondivisas.infraestructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
      @GetMapping("/")
    public String health() {
        return "Microservicio de conversion de divisas en ejecución correctamente";
    }
}
