package com.wakandaweathermonitoring.app.services;

import com.wakandaweathermonitoring.app.models.WeatherSatellite;
import com.wakandaweathermonitoring.app.repositories.WeatherSatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeatherSatelliteService {
    private final WeatherSatelliteRepository satelliteRepository;

    @Autowired
    public WeatherSatelliteService(WeatherSatelliteRepository satelliteRepository) {
        this.satelliteRepository = satelliteRepository;
    }

    public WeatherSatellite saveWeatherSatellite(WeatherSatellite weatherSatellite) {
        return satelliteRepository.save(weatherSatellite);
    }

    public Iterable<WeatherSatellite> getAllWeatherSatellites() {
        return satelliteRepository.findAll();
    }

    public Optional<WeatherSatellite> getWeatherSatelliteById(Long id) {
        return satelliteRepository.findById(id);
    }

    public void deleteWeatherSatellite(Long id) {
        satelliteRepository.deleteById(id);
    }
}

