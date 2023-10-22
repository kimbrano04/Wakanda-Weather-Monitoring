package com.wakandaweathermonitoring.app.repositories;

import com.wakandaweathermonitoring.app.models.WeatherSatellite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherSatelliteRepository extends CrudRepository<WeatherSatellite, Long> {

}