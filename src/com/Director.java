package com;

import com.Cars.Builder.SedanBuilder;
import com.Cars.Builder.CarsBuilder;
import com.Cars.Builder.PickupTruckBuilder;
import com.Cars.Builder.MinivanBuilder;

public class Director {

    public CarsBuilder makeFordSedan(SedanBuilder builder){
        builder.reset();
        builder.setName("Sedan");
        builder.setBrand("Ford");
        builder.setPrice(19000f);
        return builder;
    }

    public CarsBuilder makeFordPickupTruck(PickupTruckBuilder builder){
        builder.reset();
        builder.setName("pickup Truck");
        builder.setBrand("Ford");
        builder.setPrice(28940f);
        return builder;
    }

    public CarsBuilder makeFordMinivan(MinivanBuilder builder){
        builder.reset();
        builder.setName("Minivan");
        builder.setBrand("Ford");
        builder.setPrice(15300.65f);
        return builder;
    }

    public CarsBuilder makeMercedesSedan(SedanBuilder builder){
        builder.reset();
        builder.setName("Sedan");
        builder.setBrand("Mercedes");
        builder.setPrice(20000f);
        return builder;
    }

    public CarsBuilder makeMercedesPickupTruck(PickupTruckBuilder builder){
        builder.reset();
        builder.setName("pickup Truck");
        builder.setBrand("Mercedes");
        builder.setPrice(23580f);
        return builder;
    }

    public CarsBuilder makeMercedesMinivan(MinivanBuilder builder){
        builder.reset();
        builder.setName("Minivan");
        builder.setBrand("Mercedes");
        builder.setPrice(17999f);
        return builder;
    }

    public CarsBuilder makeToyotaSedan(SedanBuilder builder){
        builder.reset();
        builder.setName("Sedan");
        builder.setBrand("Toyota");
        builder.setPrice(9700f);
        return builder;
    }

    public CarsBuilder makeToyotaPickupTruck(PickupTruckBuilder builder){
        builder.reset();
        builder.setName("Pickup Truck");
        builder.setBrand("Toyota");
        builder.setPrice(12456f);
        return builder;
    }

    public CarsBuilder makeToyotaMinivan(MinivanBuilder builder){
        builder.reset();
        builder.setName("Minivan");
        builder.setBrand("Toyota");
        builder.setPrice(8880f);
        return builder;
    }

    public CarsBuilder makeVolkswagenSedan(SedanBuilder builder){
        builder.reset();
        builder.setName("Sedan");
        builder.setBrand("Volkswagen");
        builder.setPrice(5000f);
        return builder;
    }

    public CarsBuilder makeVolkswagenPickupTruck(PickupTruckBuilder builder){
        builder.reset();
        builder.setName("Pickup Truck");
        builder.setBrand("Volkswagen");
        builder.setPrice(12999.99f);
        return builder;
    }

    public CarsBuilder makeVolkswagenMinivan(MinivanBuilder builder){
        builder.reset();
        builder.setName("Minivan");
        builder.setBrand("Volkswagen");
        builder.setPrice(19750.50f);
        return builder;
    }
}
