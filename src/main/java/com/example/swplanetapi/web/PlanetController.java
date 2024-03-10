package com.example.swplanetapi.web;

import org.springframework.web.bind.annotation.RestController;

import com.example.swplanetapi.domain.Planet;
import com.example.swplanetapi.domain.PlanetDTO;
import com.example.swplanetapi.domain.PlanetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/sw-planet-api/planets")
public class PlanetController {

    @Autowired
    private PlanetService service;
 
    @PostMapping(name = "/cadastro")
    public ResponseEntity<Planet> createPlanet(@RequestBody PlanetDTO planet) {
        Planet planetCreated = service.createPlanetService(planet);
        return ResponseEntity.status(HttpStatus.CREATED).body(planetCreated);
    }

}
