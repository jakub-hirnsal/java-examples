package com.sda.example.sda;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Message {
    private String channelName;
    private LocalDateTime postDate;
    private String author;
    private String text;

    public Message(final String channelName, final String author, final String text) {
        this.channelName = channelName;
        this.author = author;
        this.text = text;
        this.postDate = LocalDateTime.now();
    }
}