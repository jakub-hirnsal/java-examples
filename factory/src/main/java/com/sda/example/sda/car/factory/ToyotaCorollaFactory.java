package com.sda.example.sda.car.factory;

import com.sda.example.sda.car.Car;
import com.sda.example.sda.car.CarBodyType;
import com.sda.example.sda.car.ToyotaCorollaCombi;
import com.sda.example.sda.car.ToyotaCorollaHatchback;
import com.sda.example.sda.car.ToyotaCorollaSedan;

public class ToyotaCorollaFactory implements CarFactory {

    @Override
    public Car createSedan() {
        return new ToyotaCorollaSedan();
    }

    @Override
    public Car createCombi() {
        return new ToyotaCorollaCombi();
    }

    @Override
    public Car createHatchback() {
        return new ToyotaCorollaHatchback();
    }

    @Override
    public Car createByType(CarBodyType carBodyType) {
        switch (carBodyType) {
            case COMBI:
                return createCombi();
            case SEDAN:
                return createSedan();
            case HATCHBACK:
            default:
                return createHatchback();
        }
    }
}