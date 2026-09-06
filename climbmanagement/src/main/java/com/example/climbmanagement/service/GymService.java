package com.example.climbmanagement.service;

import org.springframework.stereotype.Service;

import com.example.climbmanagement.DTOs.gym.CreateGymDTO;
import com.example.climbmanagement.DTOs.gym.ResponseGymDTO;
import com.example.climbmanagement.entity.Gym;
import com.example.climbmanagement.repository.GymRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GymService {

    private final GymRepository gymRepository;

    public ResponseGymDTO createGym(CreateGymDTO gymInDTO) {

        Gym gymEntity = DTOToEntity(gymInDTO);
        gymRepository.save(gymEntity);
        
        return entityToDTO(gymEntity);
    }
    

    // Helper Methods

    private Gym DTOToEntity(CreateGymDTO gymDTO) {
        return new Gym(gymDTO.getName(), gymDTO.getAddress(), gymDTO.getManager(), gymDTO.getMaxSectors());
    }

    private ResponseGymDTO entityToDTO(Gym gym) {
        return new ResponseGymDTO(gym.getGymId(), gym.getName(), gym.getAddress(), gym.getManager(), gym.getMaxSectors());
    }
}
