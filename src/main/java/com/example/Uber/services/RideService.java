package com.example.Uber.services;

import com.example.Uber.dto.RideRequestDto;
import com.example.Uber.entities.Driver;
import com.example.Uber.entities.Ride;
import com.example.Uber.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRiderById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRideOfRider(Long riderId, PageRequest pageRequest);

    Page<Driver> getAllRideOfDriver(Long driverId, PageRequest pageRequest);


}
