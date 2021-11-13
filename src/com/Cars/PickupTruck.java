package com.Cars;

public class PickupTruck implements Cars {
    private String name;
    private String brand;
    private String color = "black";
    private float price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {this.color = color;}

    @Override
    public String toString() {
        return "PickupTruck: " +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price + "€;";
    }
}
