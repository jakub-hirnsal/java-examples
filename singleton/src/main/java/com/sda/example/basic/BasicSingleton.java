package com.sda.example.basic;

import java.io.Serializable;

public class BasicSingleton implements Serializable, Cloneable {
    // cannot new this class, however
    // * instance can be created deliberately (reflection)
    // * instance can be created accidentally (serialization)
    private BasicSingleton() {
        System.out.println("Singleton is initializing");
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // required for correct serialization
    // readResolve is used for _replacing_ the object read from the stream

    protected Object readResolve() {
        return INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
//         return INSTANCE; // or return instance
    }


    public static BasicSingleton getInstance() {
        return INSTANCE;
    }
}