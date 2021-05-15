package com.sda.example;

import com.sda.example.lazy.CommonStorage;

public class LazyExample {

    public static void main(String[] args) {

        CommonStorage commonStorageA = CommonStorage.getInstance();
        CommonStorage commonStorageB = CommonStorage.getInstance();
        System.out.println(commonStorageA == commonStorageB);

        commonStorageA.addValue(1);
        commonStorageB.addValue(2);
        System.out.println(commonStorageA.getValues().size());

    }
}
