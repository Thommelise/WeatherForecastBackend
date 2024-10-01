package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private double latitude;
    private double longitude;
    private Double generationtime_ms;
    private Integer utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private Double elevation;
    private HourlyUnits hourly_units;
    private Hourly hourly;
    private CurrentWeather currentWeather;

}