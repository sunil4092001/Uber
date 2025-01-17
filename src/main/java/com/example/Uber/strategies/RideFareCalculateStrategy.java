package com.example.Uber.strategies;

import com.example.Uber.dto.RideRequestDto;

public interface RideFareCalculateStrategy {

    Double calculateFare(RideRequestDto rideRequestDto);
}
