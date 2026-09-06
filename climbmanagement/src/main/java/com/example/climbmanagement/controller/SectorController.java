package com.example.climbmanagement.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.climbmanagement.DTOs.sector.CreateSectorDTO;
import com.example.climbmanagement.DTOs.sector.ResponseSectorDTO;
import com.example.climbmanagement.service.SectorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/sector")
public class SectorController {

    private final SectorService sectorService;

    /* @PostMapping
    public ResponseSectorDTO createSector(@RequestBody CreateSectorDTO sector) {
        return sectorService.createSector(sector);
    } */

    /* @GetMapping("{sectorId}")
    public ResponseSectorDTO getSectorById(@PathVariable Integer sectorId) {
        return sectorService.getSectorById(sectorId);
    } */

    /* @GetMapping
    public ResponseSectorDTO getAllSectors() {
        return sectorService.getAllSectors();
    } */

    /* @DeleteMapping("{sectorId}") 
    public ResponseSectorDTO deleteSectorById(@PathVariable Integer sectorId) {
        return sectorService.deleteSectorById(sectorId);
    } */
    
}
