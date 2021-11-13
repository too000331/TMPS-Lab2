package com.Cars.Builder;

import com.Cars.Minivan;

public class MinivanBuilder implements CarsBuilder {
    private Minivan minivan;

    public MinivanBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.minivan = new Minivan();
    }

    @Override
    public void setName(String name) {
        this.minivan.setName(name);
    }

    @Override
    public void setBrand(String brand) {
        this.minivan.setBrand(brand);
    }

    @Override
    public void setPrice(float price) {
        this.minivan.setPrice(price);
    }

    public Minivan getProduct(){
        Minivan product = this.minivan;
        this.reset();
        return product;
    }
}
