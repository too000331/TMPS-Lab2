package com.AutoParts;

public class Filter implements AutoParts{
    private String name = "Filter";
    private String partbrand = "Filtron";
    private float price = 250f;

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
        return "Filter: " +
                "name='" + name + '\'' +
                ", partbrand='" + partbrand + '\'' +
                ", price=" + price + "€" ;
    }
}
