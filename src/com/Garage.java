package com;

import com.Cars.Cars;

public class Garage {
    private static volatile Garage garage;

    private Garage() {
    }

    public static Garage getGarage() {
        if (garage == null)
            synchronized (Garage.class) {
                if (garage == null)
                    garage = new Garage();
            }
        return garage;
    }

    void arrangeGarage(Cars... arranges){
        System.out.println("\nGarage objects:\n");
        for (Cars cars : arranges)
            System.out.println(cars.toString());
    }
}
