package com.example.swplanetapi.commons;

import com.example.swplanetapi.domain.Planet;
import com.example.swplanetapi.domain.PlanetDTO;

public class PlanetConstants {
	
	public static final PlanetDTO PLANET_DTO =  new PlanetDTO("Nome", "climate", "terrain");
	public static final Planet    PLANET_ENTITY =  new Planet("Nome", "climate", "terrain");
	public static final PlanetDTO    PLANET_INVALID_DTO = new PlanetDTO("", "", "");
	public static final Planet    PLANET_INVALID_ENTITY = new Planet("", "", "");

	
}
