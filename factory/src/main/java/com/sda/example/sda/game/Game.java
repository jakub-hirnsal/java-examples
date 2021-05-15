package com.sda.example.sda.game;

public interface Game {

    String getName();
    String getType();
    int getMinNumberOfPlayers();
    int getMaxNumberOfPlayers();
    boolean canBePlayedRemotely();

}