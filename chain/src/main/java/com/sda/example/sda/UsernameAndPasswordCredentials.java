package com.sda.example.sda;

public class UsernameAndPasswordCredentials implements Credentials {

    // dummy implementation -> load real user UnP in real implementation
    @Override
    public String getCredentials(final String userId) {
        return "andrzej:Andrzej_123";
    }
}