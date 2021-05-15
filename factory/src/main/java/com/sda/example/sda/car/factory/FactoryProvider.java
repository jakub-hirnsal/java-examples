package com.sda.example.sda.car.factory;

import com.sda.example.sda.car.CarType;

public class FactoryProvider {
    public CarFactory createFactory(final CarType carType) {
        switch (carType) {
            case AUDI_A4:
                return new AudiA4Factory();
            case TOYOTA_COROLLA:
                return new ToyotaCorollaFactory();
        }
        throw new UnsupportedOperationException("Cannot produce factory for this car type");
    }
}