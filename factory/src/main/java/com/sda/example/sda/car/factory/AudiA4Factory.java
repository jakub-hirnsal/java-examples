package com.sda.example.sda.car.factory;

import com.sda.example.sda.car.AudiA4Combi;
import com.sda.example.sda.car.AudiA4Hatchback;
import com.sda.example.sda.car.AudiA4Sedan;
import com.sda.example.sda.car.Car;
import com.sda.example.sda.car.CarBodyType;

public class AudiA4Factory implements CarFactory {

    @Override
    public Car createSedan() {
        return new AudiA4Sedan();
    }

    @Override
    public Car createCombi() {
        return new AudiA4Combi();
    }

    @Override
    public Car createHatchback() {
        return new AudiA4Hatchback();
    }

    @Override
    public Car createByType(CarBodyType carBodyType) {
        switch (carBodyType) {
            case HATCHBACK:
                return createHatchback();
            case SEDAN:
                return createSedan();
            case COMBI:
            default:
                return createCombi();
        }
    }
}