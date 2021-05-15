package com.sda.example.sda.car;

public class ToyotaCorollaCombi extends ToyotaCorolla {

    @Override
    public CarBodyType getType() {
        return CarBodyType.COMBI;
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
        return 540;
    }
}