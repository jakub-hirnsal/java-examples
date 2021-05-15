package com.sda.example;

import com.sda.example.sda.game.Game;
import com.sda.example.sda.game.factory.GameFactory;
import com.sda.example.sda.game.factory.MonopolyGameCreator;
import com.sda.example.sda.game.factory.ValorantGameCreator;
import java.util.Scanner;

public class GameFactoryExample {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        GameFactory gameFactory;
        String input;

        System.out.println("Enter your game type (Q for quit):");

        while (((input = scanner.nextLine())!= null) && !(input.equals("Q"))) {
            if (input.equals("PC")) {
                gameFactory = new ValorantGameCreator();
            } else if (input.equals("Board")) {
                gameFactory = new MonopolyGameCreator();
            } else {
                throw new RuntimeException("unknown game type");
            }

            var createdGame = gameFactory.create();
            System.out.println("Created game " + createdGame);
            System.out.println("\nEnter your game type (Q for quit):");


        }
    }
}
