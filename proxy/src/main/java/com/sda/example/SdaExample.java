package com.sda.example;

import com.sda.example.sda.MessageSender;
import com.sda.example.sda.MyRealSlackMessageSender;
import com.sda.example.sda.SessionTokens;
import com.sda.example.sda.SlackMessageSender;
import com.sda.example.sda.SlackMessageSenderProxy;
import com.sda.example.sda.TokenValidator;

public class SdaExample {

    public static void main(String[] args) {
        TokenValidator tokenValidator = new TokenValidator();
        SessionTokens sessionTokens = new SessionTokens();

        String userName = "Jakub Hirnšal";
        String channelName = "#test-integration";
        String message = "Hello world!";
        sessionTokens.createTokenForUser(userName);

        MessageSender realMessageSender = new SlackMessageSender();

        // TODO: This sends message to slack - you need to set SLACK_WEBHOOK_URL in MyRealSlackMessageSender class
//        MessageSender realMessageSender = new MyRealSlackMessageSender();

        MessageSender proxy = new SlackMessageSenderProxy(realMessageSender, sessionTokens, tokenValidator);

        proxy.sendMessage(channelName, userName, message);
    }

}
