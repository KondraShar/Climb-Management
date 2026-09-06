package com.example.climbmanagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.climbmanagement.DTOs.route.CreateRouteDTO;
import com.example.climbmanagement.DTOs.route.ResponseRouteDTO;
import com.example.climbmanagement.service.RouteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/route")
public class RouteController {

    private final RouteService routeService;
    
    /* @PostMapping
    public ResponseRouteDTO createRoute(@RequestBody CreateRouteDTO route) {
        return routeServiceService.createRoute();
    } */

    /* @GetMapping("{routeId}")
    public ResponseRouteDTO getRouteById(@PathVariable Integer routeId) {
        return routeService.getRouteById(routeId);
    } */

    /* @GetMapping
    public ResponseRouteDTO getAllRoutes() {
        return routeService.getAllRoutes();
    } */
    
    /* @DeleteMapping("{routeId}")
    public ResponseRouteDTO deleteRouteById(@PathVariable Integer routeId) {
        return routeService.deleteRouteById(routeId);
    } */
}
