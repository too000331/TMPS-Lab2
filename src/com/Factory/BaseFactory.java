package com.Factory;

import com.Cars.Cars;

public interface BaseFactory {
    Cars createCars(String type);
}
