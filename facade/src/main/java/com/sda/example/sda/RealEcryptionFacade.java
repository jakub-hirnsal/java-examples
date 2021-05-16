package com.sda.example.sda;

public class RealEcryptionFacade implements Encryptors {

    private Encryptor bCryptEncryptor;
    private Encryptor sCryptEncryptor;
    private Encryptor noEncryptEncryptor;

    public RealEcryptionFacade(Encryptor bCryptEncryptor, Encryptor sCryptEncryptor, Encryptor noEncryptEncryptor) {
        this.bCryptEncryptor = bCryptEncryptor;
        this.sCryptEncryptor = sCryptEncryptor;
        this.noEncryptEncryptor = noEncryptEncryptor;
    }

    @Override
    public String encryptWithoutModification(String toEncrypt) {
        return toEncrypt;
    }

    @Override
    public String encryptWithBCrypt(String toEncrypt) {
        return this.bCryptEncryptor.encrypt(toEncrypt);
    }

    @Override
    public String encryptWithSCrypt(String toEncrypt) {
        return this.sCryptEncryptor.encrypt(toEncrypt);
    }
}
