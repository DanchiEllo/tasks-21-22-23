package com.example.weatherinfoservice.controller;

import com.example.weatherinfoservice.model.Main;
import com.example.weatherinfoservice.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public Main getWeather(@RequestParam String lat, @RequestParam String lon) {
        return weatherService.getWeather(lat, lon);
    }
}