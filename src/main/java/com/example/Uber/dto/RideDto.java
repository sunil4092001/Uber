package com.example.Uber.dto;

import com.example.Uber.entities.Driver;
import com.example.Uber.entities.Rider;
import com.example.Uber.entities.enums.PaymentMethod;
import com.example.Uber.entities.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {

    private Long Id;

    private Point pickUpLocation;

    private Point dropOffLocation;

    private LocalDateTime creationTime;

    private RiderDto rider;

    private DriverDto driver;

    private RideStatus rideStatus;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;

    private Double fare;
    private PaymentMethod paymentMethod;
}
