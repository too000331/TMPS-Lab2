package com.AutoParts;

public class Motor implements AutoParts {
    private String name = "Motor";
    private String partbrand = "BMW";
    private float price = 2500f;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPartBrand(String partbrand) {
        this.partbrand = partbrand;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Motor: " +
                "name='" + name + '\'' +
                ", partbrand='" + partbrand + '\'' +
                ", price=" + price + "€" ;
    }
}
