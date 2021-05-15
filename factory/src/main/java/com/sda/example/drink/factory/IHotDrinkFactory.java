package com.sda.example.drink.factory;

import com.sda.example.drink.IHotDrink;

public interface IHotDrinkFactory {
    IHotDrink prepare(int amount);
}