package com.sda.example.sda;

public class MyBCryptEncryptor implements Encryptor {

    @Override
    public String encrypt(String toEncrypt) {
        return "My BCrypt : " + toEncrypt;
    }
}
