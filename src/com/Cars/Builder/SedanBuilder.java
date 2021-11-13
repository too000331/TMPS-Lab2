package com.Cars.Builder;

import com.Cars.Sedan;

public class SedanBuilder implements CarsBuilder {
    private Sedan sedan;

    public SedanBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.sedan = new Sedan();
    }

    @Override
    public void setName(String name) {
        this.sedan.setName(name);
    }

    @Override
    public void setBrand(String brand) {
        this.sedan.setBrand(brand);
    }

    @Override
    public void setPrice(float price) {
        this.sedan.setPrice(price);
    }

    public Sedan getProduct(){
        Sedan product = this.sedan;
        this.reset();
        return product;
    }
}
