package com.example.Uber.strategies.impl;

import com.example.Uber.dto.RideRequestDto;
import com.example.Uber.strategies.RideFareCalculateStrategy;

public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculateStrategy {
    @Override
    public Double calculateFare(RideRequestDto rideRequestDto) {
        return 0.0;
    }
}
