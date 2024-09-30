package com.example.weatherApp.api;

import com.example.weatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.weatherApp.model.WeatherResponse;
@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public WeatherResponse getWeather(float latitude, float longitude) {
        return weatherService.getWeatherData(latitude,longitude);
    }

    @GetMapping("/custom")
    public WeatherResponse getCustomWeather(
            @RequestParam float latitude,
            @RequestParam float longitude) {
        return weatherService.getWeatherData(latitude, longitude);
    }
}


