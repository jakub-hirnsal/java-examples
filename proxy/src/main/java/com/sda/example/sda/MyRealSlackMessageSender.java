package com.sda.example.sda;

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import java.io.IOException;

public class MyRealSlackMessageSender implements MessageSender {

    private static final String SLACK_WEBHOOK_URL = "PROVIDE your URL";

    @Override
    public void sendMessage(String channelName, String username, String message) {
        Payload payload = Payload.builder()
                .channel(channelName)
                .username(username)
                .iconEmoji(":rocket:")
                .text(message)
                .build();
        try {
            Slack.getInstance().send(
                    SLACK_WEBHOOK_URL,
                    payload
            );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
