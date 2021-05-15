package com.sda.example.drink.factory;

import com.sda.example.drink.Cacao;
import com.sda.example.drink.IHotDrink;

public class CacaoFactory implements IHotDrinkFactory {
    @Override
    public IHotDrink prepare(int amount) {
        System.out.println("preparing Cacao, " + amount + " ml");
        return new Cacao();
    }
}
