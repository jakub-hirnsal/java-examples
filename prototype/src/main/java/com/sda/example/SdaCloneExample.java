package com.sda.example;

import com.sda.example.sda.JavaCodeFile;
import com.sda.example.sda.JavaCodeFilesManager;

public class SdaCloneExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        final JavaCodeFilesManager javaCodeFilesManager = new JavaCodeFilesManager();
        JavaCodeFile fileA = javaCodeFilesManager.createFileWithContent("Integers", "int x = 3;");
        JavaCodeFile fileB = javaCodeFilesManager.createFileWithContent("Strings", "String y = \"3\";");
        fileB.setFileName("Chain");
        System.out.println(fileA);
        System.out.println(fileB);

    }

}
