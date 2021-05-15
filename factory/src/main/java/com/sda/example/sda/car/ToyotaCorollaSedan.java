package com.sda.example.sda.car;

public class ToyotaCorollaSedan extends ToyotaCorolla {
    @Override
    public CarBodyType getType() {
        return CarBodyType.SEDAN;
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }

    @Override
    public Float getEngineVolume() {
        return 1.8F;
    }

    @Override
    public Integer getTrunkSize() {
        return 480;
    }
}