package com.AutoParts;

public class Tires implements AutoParts{
    private String name = "Tires";
    private String partbrand = "Michelin";
    private float price = 560f;

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
        return "Tires: " +
                "name='" + name + '\'' +
                ", partbrand='" + partbrand + '\'' +
                ", price=" + price + "€" ;
    }
}
