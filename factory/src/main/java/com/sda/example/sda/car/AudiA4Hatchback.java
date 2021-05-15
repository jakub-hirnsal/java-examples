package com.sda.example.sda.car;

public class AudiA4Hatchback extends AudiA4 {
    @Override
    public CarBodyType getType() {
        // there is no a4 hatchback but its only an example ;)
        return CarBodyType.HATCHBACK;
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }

    @Override
    public Float getEngineVolume() {
        return 1.9F;
    }

    @Override
    public Integer getTrunkSize() {
        return 340;
    }
}