package com.github.eloisamorim.citiesapi.states.repository;

import com.github.eloisamorim.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
