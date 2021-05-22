package com.sda.example.sda;

public interface HTMLFile {
    String getDoctypeDeclaration();
    String getHead();
    String getBody();
    void accept(Visitor visitor);
}