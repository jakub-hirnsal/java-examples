package com.sda.example;

import com.sda.example.enums.SimpleCounter;

public class EnumExample {

    public static void main(String[] args) {
        SimpleCounter simpleCounterA = SimpleCounter.INSTANCE;
        SimpleCounter simpleCounterB = SimpleCounter.INSTANCE;

        System.out.println(simpleCounterA == simpleCounterB);

        simpleCounterA.increment();
        simpleCounterB.increment();
        System.out.println(simpleCounterA.getCurrentCount());
    }

}
