package com.example.weatherApp.model;

import lombok.Data;

@Data
public class CurrentWeatherUnits {
     private String time;
     private String interval;
     private String temperature;
     private String windSpeed;
     private String windDirection;
     private String idDay;
     private String weatherCode;
}
