package com.sda.example;

import com.sda.example.sda.Weapon;
import java.util.List;

public class WeaponExample {
    public static void main(String[] args) {

        final Weapon laserGun = new Weapon.Builder()
                .withDamage(123)
                .withName("LaserGun")
                .withPerks(List.of("Color:red"))
                .withDurability(50L)
                .build();

        System.out.println(laserGun);
    }
}
