package com.example.Uber.services;

import com.example.Uber.dto.DriverDto;
import com.example.Uber.dto.RideDto;

import java.util.List;

public interface DriverService {


    RideDto startRide(Long rideId);
    RideDto endRide(Long rideId);
    RideDto cancelRide(Long rideId);
    RideDto rateRider(Long rideId, Integer rating);

    RideDto acceptRide(Long rideId);

    DriverDto getMyProfile();
    List<RideDto> getAllMyRides();

}
