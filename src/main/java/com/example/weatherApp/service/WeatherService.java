package com.example.weatherApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.weatherApp.model.WeatherResponse;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    @Autowired
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getWeatherData(double latitude, double longitude) {
        String url = "https://api.open-meteo.com/v1/forecast?latitude="+latitude+"&longitude="+longitude+"&current=temperature_2m&hourly=temperature_2m";
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}


