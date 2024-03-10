package com.example.swplanetapi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlanetDTO {
	private String name;
	private String climate;
	private String terrain;

	public PlanetDTO() {
	}

	public PlanetDTO(String name, String climate, String terrain) {
		this.name = name;
		this.climate = climate;
		this.terrain = terrain;
	}

}
