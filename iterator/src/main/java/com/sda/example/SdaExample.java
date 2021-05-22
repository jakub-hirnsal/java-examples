package com.sda.example;

import com.sda.example.sda.Car;
import com.sda.example.sda.JavaFile;
import com.sda.example.sda.ParkingLot;
import com.sda.example.sda.SimpleCar;
import java.util.Iterator;

public class SdaExample {

    public static void main(String[] args) {
        final ParkingLot parkingLot = new ParkingLot();

        for (int idx = 1; idx <= 12; idx++) {
            parkingLot.add(new SimpleCar(idx));
        }

        final Iterator<Car> iterator = parkingLot.iterator();

        while (iterator.hasNext()) {
            final Car car = iterator.next();
            System.out.println(car);
        }

        //-------------------------------------------

        JavaFile strings = new JavaFile();
        strings.addLine("line1, hello");
        strings.addLine("line2, wonderful");
        strings.addLine("line3, world!");
        strings.addLine("line4, Have");
        strings.addLine("line5, a");
        strings.addLine("line6, great");
        strings.addLine("line7, day");

        Iterator<String> iterator2 = strings.iterator();

        while (iterator2.hasNext()) {
            String item = iterator2.next();


            System.out.println(item);
        }
        // -- vs
        strings.iterator().forEachRemaining(item -> {
            System.out.println(item);
        });
    }

}
