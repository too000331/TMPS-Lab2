package com.Factory;

import com.Director;
import com.Cars.Builder.SedanBuilder;
import com.Cars.Builder.PickupTruckBuilder;
import com.Cars.Builder.MinivanBuilder;
import com.Cars.Cars;

public class ToyotaFactory implements BaseFactory{

    private static volatile ToyotaFactory toyotaFactory;
    private Director director = new Director();

    private ToyotaFactory() {}

    public static ToyotaFactory getToyotaFactory() {
        if (toyotaFactory == null)
            synchronized (ToyotaFactory.class) {
                if (toyotaFactory == null)
                    toyotaFactory = new ToyotaFactory();
            }
        return toyotaFactory;
    }

    @Override
    public Cars createCars(String type) {
        switch (type) {
            case "sedan":
                SedanBuilder sedanBuilder = new SedanBuilder();
                director.makeToyotaSedan(sedanBuilder);
                return sedanBuilder.getProduct();
            case "pickup truck":
                PickupTruckBuilder pickupTruckBuilder = new PickupTruckBuilder();
                director.makeToyotaPickupTruck(pickupTruckBuilder);
                return pickupTruckBuilder.getProduct();
            case "minivan":
                MinivanBuilder minivanBuilder = new MinivanBuilder();
                director.makeToyotaMinivan(minivanBuilder);
                return minivanBuilder.getProduct();
            default:
                return  null;
        }
    }
}
