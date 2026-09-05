package com.example.climbmanagement.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer gymId;

    @Column(length = 200, nullable = false, unique = true)
    private String name;

    @Column(length = 255, nullable = false, unique = true)
    private String address;

    @Column(length = 100, nullable = false, unique = false)
    private String manager;

    @PositiveOrZero
    @Max(1000)
    private Integer maxSectors;

    @OneToMany(mappedBy = "gym")
    private List<Sector> sector;

    public Gym(String name, String address, String manager, Integer maxSectors) {
        this.name = name;
        this.address = address;
        this.manager = manager;
        this.maxSectors = maxSectors;
    }
    
}
