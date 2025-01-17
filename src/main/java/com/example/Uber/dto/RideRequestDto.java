package com.example.Uber.dto;

import com.example.Uber.entities.Rider;
import com.example.Uber.entities.enums.PaymentMethod;
import com.example.Uber.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {

    private Long Id;

    private Point pickUpLocation;

    private Point dropOffLocation;

    private LocalDateTime requestTime;

    private Rider rider;

    private RideRequestStatus rideRequestStatus;

    private PaymentMethod paymentMethod;
}
