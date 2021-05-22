package com.sda.example;

import com.sda.example.refactoring.guru.Player;
import com.sda.example.refactoring.guru.UI;

public class PlayerExample {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }

}
