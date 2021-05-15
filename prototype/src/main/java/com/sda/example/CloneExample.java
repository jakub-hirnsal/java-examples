package com.sda.example;

import com.sda.example.clone.Address;
import com.sda.example.clone.Person;

public class CloneExample {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person john = new Person(
                new String[]{"John", "Smith"},
                new Address("London Road", 123)
        );

        // shallow copy, not good:
        //Person jane = john;

        // jane is the girl next door
        Person jane = (Person) john.clone();
        jane.names[0] = "Jane";
        jane.address.houseNumber = 124;

        System.out.println(john);
        System.out.println(jane);
    }

}
