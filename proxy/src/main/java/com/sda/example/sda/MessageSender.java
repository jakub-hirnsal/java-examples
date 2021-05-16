package com.sda.example.sda;

public interface MessageSender {
    void sendMessage(String channelName, String username, String message);
}