package com.sda.example.faceted;

public class Person {
    // address
    public String streetAddress, postcode, city;

    // employment
    public String companyName, position;
    public int annualIncome;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }
}
