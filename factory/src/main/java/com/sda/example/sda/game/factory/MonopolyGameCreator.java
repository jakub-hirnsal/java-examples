package com.sda.example.sda.game.factory;

import com.sda.example.sda.game.BoardGame;
import com.sda.example.sda.game.Game;

public class MonopolyGameCreator implements GameFactory {
    @Override
    public Game create() {
        return new BoardGame("Monopoly", "Family Game", 4);
    }
}