package com.sda.example.lazy;

import java.util.ArrayList;
import java.util.List;

public class CommonStorage {
    private static CommonStorage instance;

    public static CommonStorage getInstance() {


//        synchronized (CommonStorage.class) {
//            if (instance == null) { // (2)
//                instance = new CommonStorage();
//            }
//        }
//
        if (instance == null) { // (1)
            synchronized (CommonStorage.class) {
                if (instance == null) { // (2)
                    instance = new CommonStorage();
                }
            }
        }

        return instance;
    }

    private final List<Integer> values = new ArrayList<>();

    private CommonStorage() {
    }

    public void addValue(final int value) {
        values.add(value);
    }

    public List<Integer> getValues() {
        return values;
    }
}