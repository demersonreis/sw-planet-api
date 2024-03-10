package com.example.swplanetapi.domain;

import org.springframework.stereotype.Service;

@Service
public class PlanetService {

    private PlanetRepository planetRepository;
    private PlanetMapper planetMapper;

    public PlanetService(PlanetRepository planetRepository, PlanetMapper planetMapper) {
        this.planetRepository = planetRepository;
        this.planetMapper = planetMapper;
    }

    /**
     * @param planetDTO
     * @return
     */
    public Planet createPlanetService(PlanetDTO planetDTO) {
        Planet planet = planetMapper.mapToEntity(planetDTO);
        return planetRepository.save(planet);
    }

}
