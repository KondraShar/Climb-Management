package com.example.climbmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.climbmanagement.entity.Gym;

public interface GymRepository extends JpaRepository<Gym, Integer>{

    
}
