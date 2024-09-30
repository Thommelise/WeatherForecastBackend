package com.example.weatherApp.model;

import lombok.Data;

import java.util.List;
@Data
public class Hourly {
    private List<String> time;
    private List<Double> temperature_2m;
}
