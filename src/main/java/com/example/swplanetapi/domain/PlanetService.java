package com.example.swplanetapi.domain;

import java.util.Optional;

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
     * @param  planetDTO
     * @return planetDTO
     */
    public PlanetDTO createPlanet(PlanetDTO planetDTO) {
        Planet planet = planetMapper.mapToEntity(planetDTO);
        planet = planetRepository.save(planet);
        PlanetDTO dto = planetMapper.mapToDTO(planet);
        return dto;    
    }

	public Optional<Planet> planetById(Long id) {
		return planetRepository.findById(id);
	}

}
