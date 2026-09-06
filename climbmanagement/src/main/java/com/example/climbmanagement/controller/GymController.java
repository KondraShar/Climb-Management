package com.example.climbmanagement.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.climbmanagement.DTOs.gym.CreateGymDTO;
import com.example.climbmanagement.DTOs.gym.ResponseGymDTO;
import com.example.climbmanagement.service.GymService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/gym")
public class GymController {

    private final GymService gymService;

    @PostMapping
    public ResponseGymDTO createGym(@RequestBody CreateGymDTO gym) {
        return gymService.createGym(gym);
    }

    /* @GetMapping("{gymId}")
    public ResponseGymDTO getGymById(@PathVariable Integer gymId) {
        return gymService.getGymById(gymId);
    } */

    /* @GetMapping
    public ResponseGymDTO getAllGyms() {
        return gymService.getAllGyms();
    } */
    
    /* @DeleteMapping("{gymId}")
    public ResponseGymDTO deleteGymById(@PathVariable Integer gymId) {
        return gymService.deleteGymById(gymId);
    } */
}
