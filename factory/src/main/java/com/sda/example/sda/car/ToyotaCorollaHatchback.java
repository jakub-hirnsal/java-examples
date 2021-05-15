package com.sda.example.sda.car;

public class ToyotaCorollaHatchback extends ToyotaCorolla {
    @Override
    public CarBodyType getType() {
        return CarBodyType.HATCHBACK;
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }

    @Override
    public Float getEngineVolume() {
        return 2.0F;
    }

    @Override
    public Integer getTrunkSize() {
        return 420;
    }
}