package com.sda.example.drink;

import com.sda.example.drink.IHotDrink;

public class Cacao implements IHotDrink {
    @Override
    public void consume() {
        System.out.println("Mmmm, its delicious!");
    }
}
