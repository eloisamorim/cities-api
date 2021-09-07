package com.github.eloisamorim.citiesapi.cities.repository;

import com.github.eloisamorim.citiesapi.cities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Long> {
}
