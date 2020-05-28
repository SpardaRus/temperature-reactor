package com.spardarus.controller;

import com.spardarus.entity.Temperature;
import com.spardarus.service.TemperatureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class TemperatureController {

    private final TemperatureService temperatureService;

    @CrossOrigin
    @GetMapping("/temperature")
    public Flux<Temperature> getTemperature() {
        return temperatureService.getTemperature();
    }
}
