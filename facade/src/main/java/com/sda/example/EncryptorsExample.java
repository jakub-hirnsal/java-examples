package com.sda.example;

import com.sda.example.sda.BCryptEncryptor;
import com.sda.example.sda.EncryptionFacade;
import com.sda.example.sda.MyBCryptEncryptor;
import com.sda.example.sda.NoOpEncryptor;
import com.sda.example.sda.RealEcryptionFacade;
import com.sda.example.sda.SCryptEncryptor;

public class EncryptorsExample {
    public static void main(String[] args) {

        EncryptionFacade encryptionFacade = new EncryptionFacade(
                new SCryptEncryptor(),
                new BCryptEncryptor(),
                new NoOpEncryptor()
        );

        RealEcryptionFacade realEcryptionFacade = new RealEcryptionFacade(
                new SCryptEncryptor(),
                new MyBCryptEncryptor(),
                new NoOpEncryptor()
        );

        String myStringToEncrypt = "Hello world! ";

        System.out.println(realEcryptionFacade.encryptWithBCrypt(myStringToEncrypt));
        System.out.println(realEcryptionFacade.encryptWithSCrypt(myStringToEncrypt));
        System.out.println(realEcryptionFacade.encryptWithoutModification(myStringToEncrypt));
    }
}
