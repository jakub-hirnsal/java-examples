package com.sda.example;

import com.sda.example.sda.AuthenticationHandler;
import com.sda.example.sda.AwsAuthenticationHandler;
import com.sda.example.sda.AwsSignature;
import com.sda.example.sda.BearerToken;
import com.sda.example.sda.BearerTokenAuthenticationHandler;
import com.sda.example.sda.ChainAuthenticationElement;
import com.sda.example.sda.Credentials;
import com.sda.example.sda.UsernameAndPasswordAuthenticationHandler;
import com.sda.example.sda.UsernameAndPasswordCredentials;

public class SdaExample {

    public static void main(String[] args) {

        final AuthenticationHandler authenticationHandlerUnP = new UsernameAndPasswordAuthenticationHandler();
        final AuthenticationHandler authenticationHandlerBearer = new BearerTokenAuthenticationHandler();
        final AuthenticationHandler authenticationHandlerAws = new AwsAuthenticationHandler();

        final ChainAuthenticationElement lastElement = new ChainAuthenticationElement(authenticationHandlerUnP);
        final ChainAuthenticationElement middleElement = new ChainAuthenticationElement(authenticationHandlerAws, lastElement);
        final ChainAuthenticationElement firstElement = new ChainAuthenticationElement(authenticationHandlerBearer, middleElement);



        Credentials credentials = new UsernameAndPasswordCredentials();

        firstElement.authenticate(credentials);
    }

}
