package com.Cars.Builder;

import com.Cars.PickupTruck;

public class PickupTruckBuilder implements CarsBuilder {
    private PickupTruck pickupTruck;

    public PickupTruckBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.pickupTruck = new PickupTruck();
    }

    @Override
    public void setName(String name) {
        this.pickupTruck.setName(name);
    }

    @Override
    public void setBrand(String brand) {
        this.pickupTruck.setBrand(brand);
    }

    @Override
    public void setPrice(float price) {
        this.pickupTruck.setPrice(price);
    }

    public PickupTruck getProduct(){
        PickupTruck product = this.pickupTruck;
        this.reset();
        return product;
    }
}
