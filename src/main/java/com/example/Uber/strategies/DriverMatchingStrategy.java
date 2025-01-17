package com.example.Uber.strategies;

import com.example.Uber.dto.RideRequestDto;
import com.example.Uber.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

     List<Driver> findMatchingDriver(RideRequestDto rideRequestDto)  ;
}
