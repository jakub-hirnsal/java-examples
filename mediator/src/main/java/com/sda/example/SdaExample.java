package com.sda.example;

import com.sda.example.sda.ActionAppliedMessage;
import com.sda.example.sda.Mediator;
import com.sda.example.sda.SelectOptions;
import com.sda.example.sda.UserActionMediator;
import com.sda.example.sda.WarningMessage;

public class SdaExample {

    public static void main(String[] args) {
        final ActionAppliedMessage actionAppliedMessage = new ActionAppliedMessage();
        final SelectOptions selectOptions = new SelectOptions();
        final WarningMessage warningMessage = new WarningMessage();

        final Mediator mediator = new UserActionMediator(actionAppliedMessage, selectOptions, warningMessage);

        selectOptions.sendRequest("load");
        selectOptions.sendRequest("save");
        selectOptions.sendRequest("restart");
        warningMessage.sendRequest("hide");
    }

}
