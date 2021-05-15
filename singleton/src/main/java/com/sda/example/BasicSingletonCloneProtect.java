package com.sda.example;

import com.sda.example.basic.BasicSingleton;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Hello world!
 */
public class BasicSingletonCloneProtect {
    static void saveToFile(BasicSingleton singleton, String filename) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singleton);
        }
    }

    static BasicSingleton readFromFile(String filename) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (BasicSingleton) in.readObject();
        }
    }


    public static void main(String[] args) throws Exception {

        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(111);

        System.out.println(singleton.getValue());
        BasicSingleton singleton2 = BasicSingleton.getInstance();
        singleton2.setValue(333);

        System.out.println(singleton.getValue());
        BasicSingleton singleton3 = BasicSingleton.getInstance();
        singleton3.setValue(444);

        System.out.println(singleton.getValue());

        System.out.println(singleton2.getValue());


//        String filename = "singleton.bin";
//        saveToFile(singleton, filename);
//
//        singleton.setValue(222);
//
//        BasicSingleton singleton2 = readFromFile(filename);
//
//        System.out.println("is equals: " + (singleton == singleton2));
//        System.out.println("singleton val: " + singleton.getValue());
//        System.out.println("singleton2 val: " + singleton2.getValue());
//
//        // -----------
//
//        BasicSingleton instance1 = BasicSingleton.getInstance();
//        BasicSingleton instance2 = (BasicSingleton) instance1.clone();
//        System.out.println("instance1 hashCode:- "
//                + instance1.hashCode());
//        System.out.println("instance2 hashCode:- "
//                + instance2.hashCode());

    }
}
