package com.sda.example.sda;

public interface Component {
    void sendRequest();

    default void sendRequest(String context) {
        sendRequest();
    }
}