package com.sda.example;

import com.sda.example.drink.HotDrinkMachine;
import com.sda.example.drink.IHotDrink;

public class HotDrinkExample {

    public static void main(String[] args) throws Exception
    {
        HotDrinkMachine machine = new HotDrinkMachine();

        while (true) {
            // interactive
            IHotDrink drink = machine.makeDrink();
            drink.consume();
            System.out.println();
        }
    }

}
