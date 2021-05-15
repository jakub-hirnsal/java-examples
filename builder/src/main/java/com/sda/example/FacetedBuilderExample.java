package com.sda.example;

import com.sda.example.faceted.Person;
import com.sda.example.faceted.PersonBuilder;

public class FacetedBuilderExample {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();

        Person person = pb
            .lives()
                .at("123 London Road")
                .in("London")
                .withPostcode("SW12BC")
            .works()
                .at("Fabrikam")
                .asA("Engineer")
                .earning(123000)
                .build();

        System.out.println(person);
    }
}