package com.example.climbmanagement.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.example.climbmanagement.entity.enums.ColorType;
import com.example.climbmanagement.entity.enums.GradeType;
import com.example.climbmanagement.entity.enums.RouteType;
import com.example.climbmanagement.entity.enums.StatusType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer routeId;

    @Column(length = 200)
    private String name;

    @Column(length = 200, nullable = false, unique = false)
    private String setter;

    @Column(length = 400)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GradeType grade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ColorType color;


    private LocalDate openedAt;
    private LocalDate takenDownAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusType status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RouteType routeType;

    @ManyToMany(mappedBy = "routes")
    private Set<Sector> sectors = new HashSet<>();

    public Route(String name, String setter, String description, GradeType grade, ColorType color, LocalDate openedAt, LocalDate takenDownAt, StatusType status, RouteType routeType, Set<Sector> sectors) {
        this.name = name;
        this.setter = setter;
        this.description = description;
        this.grade  = grade;
        this.color = color;
        this.openedAt = openedAt;
        this.takenDownAt = takenDownAt;
        this.status = status;
        this.routeType = routeType;
        this.sectors = sectors;
    }
}
