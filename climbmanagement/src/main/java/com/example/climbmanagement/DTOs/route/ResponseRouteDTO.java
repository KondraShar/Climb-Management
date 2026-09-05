package com.example.climbmanagement.DTOs.route;

import java.time.LocalDate;

import javax.swing.plaf.synth.ColorType;

import com.example.climbmanagement.entity.enums.GradeType;
import com.example.climbmanagement.entity.enums.RouteType;
import com.example.climbmanagement.entity.enums.StatusType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseRouteDTO {

    private Integer routeId;
    private String name;
    private String setter;
    private String description;
    private GradeType grade;
    private ColorType color;
    private LocalDate openedAt;
    private LocalDate takenDownAt;
    private StatusType status;
    private RouteType supportedRouteType;
    
}
