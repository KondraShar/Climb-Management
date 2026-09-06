package com.example.climbmanagement.service;

import org.springframework.stereotype.Service;

import com.example.climbmanagement.DTOs.gym.CreateGymDTO;
import com.example.climbmanagement.DTOs.gym.ResponseGymDTO;
import com.example.climbmanagement.entity.Gym;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GymService {

    public ResponseGymDTO createGym(CreateGymDTO gymInDTO) {

        Gym gymEntity = null;

        return entityToDTO(gymEntity);
    }
    

    // Helper Methods

    private ResponseGymDTO entityToDTO(Gym gym) {
        return null;
    }
}
