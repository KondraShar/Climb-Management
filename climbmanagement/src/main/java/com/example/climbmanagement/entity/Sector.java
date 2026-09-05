package com.example.climbmanagement.entity;

import java.util.HashSet;
import java.util.Set;

import com.example.climbmanagement.entity.enums.RouteType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"gymId", "name"}))
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer sectorId;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer wallHeight;

    @Column(nullable = false)
    private Integer capacity;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RouteType supportedRouteType;

    @ManyToOne
    @JoinColumn(name = "gymId", nullable = false)
    private Gym gym;

    @ManyToMany
    @JoinTable(name = "route_hangs_in",
        joinColumns = @JoinColumn(name = "sectorId"),
        inverseJoinColumns = @JoinColumn(name = "routeId"))
    private Set<Route> routes = new HashSet<>();

    public Sector(String name, Integer wallHeight, Integer capacity, RouteType routeType, Gym gym) {
        this.name = name;
        this.wallHeight = wallHeight;
        this.capacity = capacity;
        this.supportedRouteType = routeType;
        this.gym = gym;
    }
    
}
