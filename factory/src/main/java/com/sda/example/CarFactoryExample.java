package com.sda.example;

import com.sda.example.sda.car.Car;
import com.sda.example.sda.car.CarBodyType;
import com.sda.example.sda.car.CarType;
import com.sda.example.sda.car.factory.CarFactory;
import com.sda.example.sda.car.factory.FactoryProvider;
import java.util.Scanner;

public class CarFactoryExample {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter your car type (Q for quit):");
        while (((input = scanner.nextLine()) != null) && !(input.equals("Q"))) {
            var carType = CarType.valueOf(input);
            System.out.println("User wants to produce a " + carType);
            System.out.println("Enter your car BODY (shape):");
            input = scanner.nextLine();

            CarFactory factory = new FactoryProvider().createFactory(carType);
            var car = factory.createByType(CarBodyType.valueOf(input));
            System.out.println("There is your beautiful car " + car);
            System.out.println("Enter your car type (Q for quit):");
        }


        // without scanner
        CarFactory factory = new FactoryProvider().createFactory(CarType.AUDI_A4);
        var myCar = factory.createByType(CarBodyType.HATCHBACK);
        System.out.println(myCar);
    }


}
