package com.sda.example;

import com.sda.example.sda.ChangeFileNameCommand;
import com.sda.example.sda.Command;
import com.sda.example.sda.JavaFile;
import com.sda.example.sda.RemoveEmptyLinesCommand;
import java.util.List;

public class CommandExample {

    public static void main(String[] args) {

        final JavaFile javaFile = new JavaFile("Commands.java", "Commands",
                List.of("Command {", " ", "private String content;", "}"));


        final Command changeFileNameCommand = new ChangeFileNameCommand(javaFile, "UpdatedCommands.java");
        final Command removeEmptyLinesCommand = new RemoveEmptyLinesCommand(javaFile);

        System.out.println(javaFile);

        removeEmptyLinesCommand.apply();
        System.out.println(javaFile);

        removeEmptyLinesCommand.cancel();
        System.out.println(javaFile);
//        removeEmptyLinesCommand.apply();
//
//        System.out.println(javaFile);
//
//        changeFileNameCommand.cancel();
//
//        System.out.println(javaFile);
    }

}
