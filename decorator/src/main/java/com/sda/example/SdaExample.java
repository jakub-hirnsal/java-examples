package com.sda.example;

import com.sda.example.sda.DeathCountInfoDecorator;
import com.sda.example.sda.DisplayCountersDecorator;
import com.sda.example.sda.FirstPersonShooterFragStatistics;
import com.sda.example.sda.FragDeathRatioDecorator;
import com.sda.example.sda.FragInfoDecorator;
import com.sda.example.sda.FragStatistics;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SdaExample {

    public static void main(String[] args) throws FileNotFoundException {
        FragStatistics statistics = new FirstPersonShooterFragStatistics();

        statistics.incrementDeathCount(); // nothing appears on the screen
        statistics.incrementFragCount(); // nothing appears on the screen

        // use of decorators
//        FragStatistics decoratedStatistics = new FragDeathRatioDecorator(
//                new FragInfoDecorator(
//                        new DisplayCountersDecorator(
//                                new DeathCountInfoDecorator(statistics)
//                        )
//                )
//        );

        FragStatistics decoratedStatistics = new FragDeathRatioDecorator(
                new DisplayCountersDecorator(
                        new FragInfoDecorator(
                                new DeathCountInfoDecorator(statistics)
                        )
                )
        );

        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount(); // because we are good players!
        decoratedStatistics.incrementDeathCount();
    }

}
