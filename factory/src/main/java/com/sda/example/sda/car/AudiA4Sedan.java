package com.sda.example.sda.car;

public class AudiA4Sedan extends AudiA4 {
    @Override
    public CarBodyType getType() {
        return CarBodyType.SEDAN;
    }

    @Override
    public Integer getCylindersNum() {
        return 6;
    }

    @Override
    public Float getEngineVolume() {
        return 2.5F;
    }

    @Override
    public Integer getTrunkSize() {
        return 460;
    }
}