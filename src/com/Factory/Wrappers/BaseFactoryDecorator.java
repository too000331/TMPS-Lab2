package com.Factory.Wrappers;

import com.Factory.BaseFactory;
import com.Cars.Cars;

public class BaseFactoryDecorator implements BaseFactory {
    protected BaseFactory wrapper;

    public BaseFactoryDecorator(BaseFactory baseFactory){

        this.wrapper = baseFactory;
    }

    public Cars createCars(String type) {
        return wrapper.createCars(type);
    }
}
