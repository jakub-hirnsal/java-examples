package com.sda.example;

import com.sda.example.sda.PaidState;
import com.sda.example.sda.ParkingTicketVendingMachine;
import com.sda.example.sda.ParkingTicketVendingMachineState;
import com.sda.example.sda.StillNeedToPayState;

public class SdaExample {

    public static void main(String[] args) {
        final ParkingTicketVendingMachine machine = new ParkingTicketVendingMachine();
        ParkingTicketVendingMachineState state = new StillNeedToPayState(machine);

        state.openMachineAndAddPrintingPaperPieces();
        state.pressPrintingButton();
        state.moveCreditCardToSensor();

        state = new PaidState(machine);
        state.moveCreditCardToSensor();
        state.openMachineAndAddPrintingPaperPieces();
        state.pressPrintingButton();
    }

}
