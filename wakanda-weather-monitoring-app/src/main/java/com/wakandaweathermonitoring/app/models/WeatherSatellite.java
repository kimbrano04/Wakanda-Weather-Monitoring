package com.wakandaweathermonitoring.app.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WeatherSatellite {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private double latitude;
    private double longitude;
    private double cloud_temperature;
    private double wind_speed;
    private String date_time;

    private String satelite_satelite_id;


    public WeatherSatellite(Long id,  double latitude, double longitude, double cloud_temperature, double wind_speed, String date_time, String satelite_satelite_id) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cloud_temperature = cloud_temperature;
        this.wind_speed = wind_speed;
        this.date_time = date_time;
        this.satelite_satelite_id = satelite_satelite_id;
    }

    public double getCloud_temperature() {
        return cloud_temperature;
    }

    public void setCloud_temperature(double cloud_temperature) {
        this.cloud_temperature = cloud_temperature;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getSatelite_satelite_id() {
        return satelite_satelite_id;
    }

    public void setSatelite_satelite_id(String satelite_satelite_id) {
        this.satelite_satelite_id = satelite_satelite_id;
    }

    // Constructors, getters, and setters
    public WeatherSatellite() {
        // Default constructor
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getCloudTemperature() {
        return cloud_temperature;
    }

    public void setCloudTemperature(double cloudTemperature) {
        this.cloud_temperature = cloudTemperature;
    }

    public double getWindSpeed() {
        return wind_speed;
    }

    public void setWindSpeed(double windSpeed) {
        this.wind_speed = windSpeed;
    }

    public String getTimestamp() {
        return date_time;
    }

    public void setTimestamp(String timestamp) {
        this.date_time = timestamp;
    }


}
