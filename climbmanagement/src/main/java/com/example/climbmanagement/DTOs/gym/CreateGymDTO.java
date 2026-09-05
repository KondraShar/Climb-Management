package com.example.climbmanagement.DTOs.gym;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateGymDTO {
    
    private String name;
    private String address;
    private String manager;
    private Integer maxSectors;
}
