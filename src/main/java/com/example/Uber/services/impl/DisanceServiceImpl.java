package com.example.Uber.services.impl;

import com.example.Uber.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DisanceServiceImpl implements DistanceService {
    @Override
    public double CalculateDistance(Point src, Point dest) {
        return 0;
    }
}
