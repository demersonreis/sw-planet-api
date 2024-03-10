package com.example.swplanetapi.domain;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PlanetMapper {     
    public Planet mapToEntity(PlanetDTO dto) {     
        Planet planet = new Planet();
        planet.setClimate(dto.getClimate());
        planet.setName(dto.getName());
        planet.setTerrain(dto.getTerrain());
        return planet;
    }
    
    public PlanetDTO mapToDTO(Planet Entity) {     
        PlanetDTO planet = new PlanetDTO();
        planet.setClimate(Entity.getClimate());
        planet.setName(Entity.getName());
        planet.setTerrain(Entity.getTerrain());
        return planet;
    }
}
