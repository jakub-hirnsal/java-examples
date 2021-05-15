package com.sda.example.sda.car;

public interface Car {
    CarBodyType getType();
    String getModelName();
    Integer getCylindersNum();
    String getProducer();
    Float getEngineVolume();
    Integer getTrunkSize();
}