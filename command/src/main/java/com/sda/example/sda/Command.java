package com.sda.example.sda;

public interface Command {
    void apply();
    void cancel();
}