package com.spardarus.service;

import com.spardarus.entity.Temperature;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;

@Service
public class TemperatureServiceImpl implements TemperatureService {

    private final Random rnd = new Random();

    public Flux<Temperature> getTemperature() {
        return Flux.range(1, 5)
                .delayElements(Duration.ofSeconds(1L))
                .map((id) -> new Temperature(id.longValue(), getRndTemperature()));
    }

    private Double getRndTemperature() {
        return rnd.nextGaussian();
    }
}
