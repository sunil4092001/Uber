package com.example.Uber.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    double CalculateDistance(Point src, Point dest);
}
