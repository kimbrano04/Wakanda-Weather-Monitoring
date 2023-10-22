package com.wakandaweathermonitoring.app.controllers;

import com.wakandaweathermonitoring.app.models.WeatherSatellite;
import com.wakandaweathermonitoring.app.services.WeatherSatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/weather-satellites")
public class WeatherSatelliteController {
    private final WeatherSatelliteService satelliteService;

    @Autowired
    public WeatherSatelliteController(WeatherSatelliteService satelliteService) {
        this.satelliteService = satelliteService;
    }

    @PostMapping
    public ResponseEntity<WeatherSatellite> createWeatherSatellite(@RequestBody WeatherSatellite weatherSatellite) {
        WeatherSatellite savedSatellite = satelliteService.saveWeatherSatellite(weatherSatellite);
        return ResponseEntity.ok(savedSatellite);
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<WeatherSatellite>> getAllWeatherSatellites() {
        Iterable<WeatherSatellite> satellites = satelliteService.getAllWeatherSatellites();
        return ResponseEntity.ok(satellites);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WeatherSatellite> getWeatherSatelliteById(@PathVariable Long id) {
        Optional<WeatherSatellite> satellite = satelliteService.getWeatherSatelliteById(id);
        return satellite.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWeatherSatellite(@PathVariable Long id) {
        satelliteService.deleteWeatherSatellite(id);
        return ResponseEntity.noContent().build();
    }
}

