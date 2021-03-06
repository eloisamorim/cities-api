package com.github.eloisamorim.citiesapi.states;


import com.github.eloisamorim.citiesapi.states.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository respository;

    @GetMapping
    public Page<State> states(Pageable page) {
        return respository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id) {
        Optional<State> state = respository.findById(id);
        if (state.isPresent()) {
            return ResponseEntity.ok().body(state.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
