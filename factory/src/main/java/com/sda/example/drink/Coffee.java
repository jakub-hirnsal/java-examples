package com.sda.example.drink;

public class Coffee implements IHotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is delicious");
    }
}