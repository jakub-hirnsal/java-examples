package com.sda.example;

import com.sda.example.sda.PerformanceTestTemplate;
import com.sda.example.sda.RandomListSortingPerformanceTest;
import com.sda.example.sda.StringBuilderAppendPerformanceTest;

public class SdaExample {

    public static void main(String[] args) {
        System.out.println("RandomListSortingPerformanceTest");
        PerformanceTestTemplate testTemplate = new RandomListSortingPerformanceTest();
        testTemplate.run();
        System.out.println();
        System.out.println("StringBuilderAppendPerformanceTest");
        testTemplate = new StringBuilderAppendPerformanceTest();
        testTemplate.run();
    }

}
