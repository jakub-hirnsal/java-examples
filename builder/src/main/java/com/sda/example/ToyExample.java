package com.sda.example;

import com.sda.example.sda.Toy;
import com.sda.example.sda.ToyBuilder;

public class ToyExample {

    public static void main(String[] args) {
        final Toy toy = new ToyBuilder()
                .withMadeOf("plastic")
                .withName("Matchbox car")
                .withType("Small car")
                .createToy();

        System.out.println(toy.toString());
    }

}
