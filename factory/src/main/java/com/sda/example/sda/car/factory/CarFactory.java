package com.sda.example.sda.car.factory;

import com.sda.example.sda.car.Car;
import com.sda.example.sda.car.CarBodyType;

public interface CarFactory {
    Car createSedan();
    Car createCombi();
    Car createHatchback();
    Car createByType(CarBodyType carBodyType);
}