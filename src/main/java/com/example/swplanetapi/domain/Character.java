package com.example.swplanetapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String gender;
    private String species;

    @ManyToOne
    @JoinColumn(name = "planet_id", nullable = false)
    private Planet homeworld;

    public Character() {
    }

    public Character(String name, String gender, String species, Planet homeworld) {
        this.name = name;
        this.gender = gender;
        this.species = species;
        this.homeworld = homeworld;
    }
}
