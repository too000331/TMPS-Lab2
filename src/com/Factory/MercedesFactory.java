package com.Factory;

import com.Director;
import com.Cars.Builder.SedanBuilder;
import com.Cars.Builder.PickupTruckBuilder;
import com.Cars.Builder.MinivanBuilder;
import com.Cars.Cars;

public class MercedesFactory implements BaseFactory{

    private static volatile MercedesFactory mercedesFactory;
    private Director director = new Director();

    private MercedesFactory() {}

    public static MercedesFactory getMercedesFactory() {
        if (mercedesFactory == null)
            synchronized (MercedesFactory.class) {
                if (mercedesFactory == null)
                    mercedesFactory = new MercedesFactory();
            }
        return mercedesFactory;
    }

    @Override
    public Cars createCars(String type) {
        switch (type){
            case "sedan":
                SedanBuilder sedanBuilder = new SedanBuilder();
                director.makeMercedesSedan(sedanBuilder);
                return sedanBuilder.getProduct();
            case "pickup truck":
                PickupTruckBuilder pickuptruckBuilder = new PickupTruckBuilder();
                director.makeMercedesPickupTruck(pickuptruckBuilder);
                return pickuptruckBuilder.getProduct();
            case "minivan":
                MinivanBuilder minivanBuilder = new MinivanBuilder();
                director.makeMercedesMinivan(minivanBuilder);
                return minivanBuilder.getProduct();
            default:
                return null;
        }
    }
}
