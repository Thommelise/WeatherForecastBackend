package com.example.weatherApp.model;

import lombok.Data;

import java.util.Date;

@Data
public class CurrentWeather {
    private String time;
    private double interval;
    private double temperature;
    private double windDirection;
    private boolean isDay;
    private double weatherCode;
}
