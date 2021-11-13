package com.Factory;

import com.Director;
import com.Cars.Builder.SedanBuilder;
import com.Cars.Builder.PickupTruckBuilder;
import com.Cars.Builder.MinivanBuilder;
import com.Cars.Cars;

public class VolkswagenFactory implements BaseFactory{

    private static volatile VolkswagenFactory volkswagenFactory;
    private Director director = new Director();

    public static VolkswagenFactory getVolkswagenFactory() {
        if (volkswagenFactory == null)
            synchronized (VolkswagenFactory.class) {
                if (volkswagenFactory == null)
                    volkswagenFactory = new VolkswagenFactory();
            }
        return volkswagenFactory;
    }

    private VolkswagenFactory() {}

    @Override
    public Cars createCars(String type) {
        switch (type) {
            case "sedan":
                SedanBuilder sedanBuilder = new SedanBuilder();
                director.makeVolkswagenSedan(sedanBuilder);
                return sedanBuilder.getProduct();
            case "pickup truck":
                PickupTruckBuilder pickupTruckBuilder = new PickupTruckBuilder();
                director.makeVolkswagenPickupTruck(pickupTruckBuilder);
                return pickupTruckBuilder.getProduct();
            case "minivan":
                MinivanBuilder minivanBuilder = new MinivanBuilder();
                director.makeVolkswagenMinivan(minivanBuilder);
                return minivanBuilder.getProduct();
            default:
                return  null;
        }
    }
}
