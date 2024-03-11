package com.example.swplanetapi.domain;

import static com.example.swplanetapi.commons.PlanetConstants.PLANET_DTO;
import static com.example.swplanetapi.commons.PlanetConstants.PLANET_ENTITY;
import static com.example.swplanetapi.commons.PlanetConstants.PLANET_INVALID_DTO;
import static com.example.swplanetapi.commons.PlanetConstants.PLANET_INVALID_ENTITY;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PlanetServiceTest {

	@InjectMocks
	private PlanetService planetService;
	@Mock
	private PlanetRepository planetRepository;
	@Mock
	private PlanetMapper mapper;

	// operacao_estado_retorno
	// system under test -> sut
	@Test
	public void createPlanet_ComDadosValidos_PlanetaCriado() {
		when(mapper.mapToEntity(PLANET_DTO)).thenReturn(PLANET_ENTITY);
		when(planetRepository.save(PLANET_ENTITY)).thenReturn(PLANET_ENTITY);
		when(mapper.mapToDTO(PLANET_ENTITY)).thenReturn(PLANET_DTO);
		PlanetDTO sut = planetService.createPlanet(PLANET_DTO);
		assertThat(sut).isEqualTo(PLANET_DTO);
	}
	
	
	@Test
	public void createPlanet_ComDadosInvalidos_Exptions() {		
		when(planetRepository.save(PLANET_INVALID_ENTITY)).thenThrow(RuntimeException.class);
		
		assertThatThrownBy(() -> planetService
				.createPlanet(PLANET_INVALID_DTO))
		        .isInstanceOf(RuntimeException.class);
	}
}
