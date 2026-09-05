package com.example.climbmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer sectorId;

    @Column(length = 100, nullable = false, unique = true)
    private String name;

    @PositiveOrZero
    @Max(60)
    private Integer wallHeight;

    @PositiveOrZero
    @Max(20)
    private Integer capacity;

    @Column(nullable = false)
    private RouteType supportedRouteType;

    @ManyToOne
    @JoinColumn(name = "gymId", nullable = false)
    private Gym gym;

    public Sector(String name, Integer wallHeight, Integer capacity, RouteType routeType, Gym gym) {
        this.name = name;
        this.wallHeight = wallHeight;
        this.capacity = capacity;
        this.supportedRouteType = routeType;
        this.gym = gym;
    }
    
}
