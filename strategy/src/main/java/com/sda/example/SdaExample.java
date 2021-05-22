package com.sda.example;

import com.sda.example.sda.SpacesModificationStrategy;
import com.sda.example.sda.SpacesModificationStrategyProvider;
import com.sda.example.sda.StrategyType;

public class SdaExample {

    public static void main(String[] args) {

        final StrategyType strategyType = StrategyType.REMOVE;

        final String input = "hello from SDA knowledge base!";

        final SpacesModificationStrategyProvider provider = new SpacesModificationStrategyProvider();

        SpacesModificationStrategy strategy = provider.get(strategyType);
        final String output = strategy.modify(input);

        System.out.println("Result is " + output);
    }

}
