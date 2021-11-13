package com.Cars;

public class Sedan implements Cars {
    private String name;
    private String brand;
    private String color = "gray";
    private float price;

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {this.color = color;}

    @Override
    public String toString() {
        return "Sedan: " +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price + "€;";
    }
}
