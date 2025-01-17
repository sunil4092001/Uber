package com.example.Uber.strategies.impl;

import com.example.Uber.dto.RideRequestDto;
import com.example.Uber.entities.Driver;
import com.example.Uber.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
