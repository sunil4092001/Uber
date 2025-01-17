package com.example.Uber.strategies.impl;

import com.example.Uber.dto.RideRequestDto;
import com.example.Uber.entities.Driver;
import com.example.Uber.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
