package com.example.swplanetapi.domain;

public class PlanetMapper {   
    public Planet mapToPlanet(PlanetDTO dto) {     
        Planet planet = new Planet();
        planet.setClimate(dto.getClimate());
        planet.setName(dto.getName());
        planet.setTerrain(dto.getTerrain());
        return planet;
    }
}
