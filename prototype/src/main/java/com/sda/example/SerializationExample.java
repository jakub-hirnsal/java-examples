package com.sda.example;

import com.sda.example.serialization.Foo;
import org.apache.commons.lang3.SerializationUtils;

public class SerializationExample {

    public static void main(String[] args)
    {
        Foo foo = new Foo(42, "life");
        // use apache commons!
        Foo foo2 = SerializationUtils.roundtrip(foo);

        foo2.whatever = "xyz";

        System.out.println(foo);
        System.out.println(foo2);
    }

}
