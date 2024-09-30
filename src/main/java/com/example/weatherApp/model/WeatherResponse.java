package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private float latitude;
    private float longitude;
    private double generationtime_ms;
    private int utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private double elevation;
    private HourlyUnits hourly_units;
    private Hourly hourly;

}