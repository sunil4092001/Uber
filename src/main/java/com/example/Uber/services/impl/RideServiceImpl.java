package com.example.Uber.services.impl;

import com.example.Uber.dto.RideRequestDto;
import com.example.Uber.entities.Driver;
import com.example.Uber.entities.Ride;
import com.example.Uber.entities.enums.RideStatus;
import com.example.Uber.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRiderById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRideOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Driver> getAllRideOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
