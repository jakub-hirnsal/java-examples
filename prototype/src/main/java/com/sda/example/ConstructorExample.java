package com.sda.example;

import com.sda.example.constructors.Address;
import com.sda.example.constructors.Employee;

public class ConstructorExample {
    public static void main(String[] args) {
        Employee john = new Employee(
                "John",
                new Address("123 London Road", "London", "UK")
        );

        Employee chris = new Employee(john);

        chris.name = "Chris";
        System.out.println(john);
        System.out.println(chris);
    }
}
