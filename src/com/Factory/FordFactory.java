package com.Factory;

import com.Director;
import com.Cars.Builder.SedanBuilder;
import com.Cars.Builder.PickupTruckBuilder;
import com.Cars.Builder.MinivanBuilder;
import com.Cars.Cars;

public class FordFactory implements BaseFactory{

    private static volatile FordFactory fordFactory;
    private Director director = new Director();

    private FordFactory() {}

    public static FordFactory getFordFactory() {
        if (fordFactory == null)
            synchronized (FordFactory.class) {
                if (fordFactory == null)
                    fordFactory = new FordFactory();
            }
        return fordFactory;
    }

    @Override
    public Cars createCars(String type) {
        switch (type){
            case "sedan":
                SedanBuilder sedanBuilder = new SedanBuilder();
                director.makeFordSedan(sedanBuilder);
                return sedanBuilder.getProduct();
            case "pickup truck":
                PickupTruckBuilder pickuptruckBuilder = new PickupTruckBuilder();
                director.makeFordPickupTruck(pickuptruckBuilder);
                return pickuptruckBuilder.getProduct();
            case "minivan":
                MinivanBuilder minivanBuilder = new MinivanBuilder();
                director.makeFordMinivan(minivanBuilder);
                return minivanBuilder.getProduct();
            default:
                return null;
        }
    }
}
