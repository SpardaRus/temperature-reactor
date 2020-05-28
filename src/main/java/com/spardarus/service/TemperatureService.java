package com.spardarus.service;

import com.spardarus.entity.Temperature;
import reactor.core.publisher.Flux;

public interface TemperatureService {
    Flux<Temperature> getTemperature();
}
