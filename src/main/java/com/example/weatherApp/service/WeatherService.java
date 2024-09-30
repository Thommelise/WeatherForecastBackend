package com.example.weatherApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.weatherApp.model.WeatherResponse;

@Service
public class WeatherService {

    private static final String WEATHER_API_URL =
            "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m";

    private final RestTemplate restTemplate;

    @Autowired
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getWeatherData(float latitude, float longitude) {
        String url = String.format(
                "https://api.open-meteo.com/v1/forecast?latitude="+latitude+"&longitude="+longitude+"&hourly=temperature_2m");
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}


