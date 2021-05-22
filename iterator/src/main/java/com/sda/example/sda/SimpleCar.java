package com.sda.example.sda;

import lombok.ToString;

@ToString
public class SimpleCar implements Car {

    private final String info;

    public SimpleCar(int index) {
        info = "Mazda 6 with id " + index;
    }

    @Override
    public String getVehicleInfo() {
        return info;
    }
}