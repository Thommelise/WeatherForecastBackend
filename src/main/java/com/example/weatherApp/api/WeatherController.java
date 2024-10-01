package com.example.weatherApp.api;

import com.example.weatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.weatherApp.model.WeatherResponse;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public WeatherResponse getWeather(double latitude, double longitude) {
        return weatherService.getWeatherData(latitude,longitude);
    }
    @GetMapping("/custom")
    public WeatherResponse getCustomWeather(
            @RequestParam double latitude,
            @RequestParam double longitude) {
        return weatherService.getWeatherData(latitude, longitude);
    }
}


