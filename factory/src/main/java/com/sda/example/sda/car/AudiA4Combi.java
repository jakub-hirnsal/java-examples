package com.sda.example.sda.car;

public class AudiA4Combi extends AudiA4 {

    @Override
    public CarBodyType getType() {
        return CarBodyType.COMBI;
    }

    @Override
    public Integer getCylindersNum() {
        return 6;
    }

    @Override
    public Float getEngineVolume() {
        return 2.7F;
    }

    @Override
    public Integer getTrunkSize() {
        return 540;
    }
}