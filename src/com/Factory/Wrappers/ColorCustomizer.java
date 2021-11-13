package com.Factory.Wrappers;

import com.Factory.BaseFactory;
import com.Cars.Cars;

public class ColorCustomizer extends BaseFactoryDecorator {
    private final String customColor;

    public ColorCustomizer(BaseFactory baseFactory, String customColor) {
        super(baseFactory);
        this.customColor = customColor;
    }

    @Override
    public Cars createCars(String type) {
        Cars cars = super.createCars(type);
        cars.setColor(this.customColor);
        return cars;
    }
}
