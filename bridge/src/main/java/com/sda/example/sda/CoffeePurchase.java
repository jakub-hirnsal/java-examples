package com.sda.example.sda;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class CoffeePurchase implements DrinkPurchase {

    @Override
    public Drink buy(final Double cost) {
        log.info("Buying a a coffee for {}", cost);
        return new Coffee();
    }


}