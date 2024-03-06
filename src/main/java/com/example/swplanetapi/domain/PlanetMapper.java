package com.example.swplanetapi.domain;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PlanetMapper {     
    public Planet mapToPlanet(PlanetDTO dto) {     
        Planet planet = new Planet();
        planet.setClimate(dto.getClimate());
        planet.setName(dto.getName());
        planet.setTerrain(dto.getTerrain());
        return planet;
    }
}
