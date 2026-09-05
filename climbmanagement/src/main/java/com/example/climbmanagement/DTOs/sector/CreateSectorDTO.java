package com.example.climbmanagement.DTOs.sector;

import com.example.climbmanagement.entity.enums.RouteType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateSectorDTO {
    
    private String name;
    private Integer wallHeight;
    private Integer capacity;
    private RouteType supportedRouteType;
}
