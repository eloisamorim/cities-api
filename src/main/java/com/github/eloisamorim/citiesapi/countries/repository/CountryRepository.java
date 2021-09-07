package com.github.eloisamorim.citiesapi.countries.repository;

import com.github.eloisamorim.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
