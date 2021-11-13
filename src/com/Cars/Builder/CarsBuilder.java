package com.Cars.Builder;

public interface CarsBuilder {
    void reset();
    void setName(String name);
    void setBrand(String brand);
    void setPrice(float price);
}
