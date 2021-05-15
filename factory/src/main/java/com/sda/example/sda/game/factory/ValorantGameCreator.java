package com.sda.example.sda.game.factory;

import com.sda.example.sda.game.Game;
import com.sda.example.sda.game.PCGame;

public class ValorantGameCreator implements GameFactory {
    @Override
    public Game create() {
        return new PCGame("Valorant", "FPS", 4, 10, true);
    }
}