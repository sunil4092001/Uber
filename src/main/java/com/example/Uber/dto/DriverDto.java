package com.example.Uber.dto;

import com.example.Uber.entities.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.awt.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {


    private UserDto user;

    private Double rating;

}
