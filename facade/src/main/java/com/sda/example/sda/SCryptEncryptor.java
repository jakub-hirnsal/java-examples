package com.sda.example.sda;

public class SCryptEncryptor implements Encryptor {
    @Override
    public String encrypt(final String toEncrypt) {
        return "encrypting " + toEncrypt + "with SCrypt";
    }
}