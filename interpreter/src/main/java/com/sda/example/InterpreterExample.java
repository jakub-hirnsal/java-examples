package com.sda.example;

import com.sda.example.sda.Interpreter;
import com.sda.example.sda.MathOperationApplier;
import com.sda.example.sda.PythonStyleWithoutOrderMathOperationsInterpreter;
import com.sda.example.sda.WordsWithoutOrderMathOperationsInterpreter;

public class InterpreterExample {

    public static void main(String[] args) {
        String input1 = "2 + 3 * 2";
        String input2 = "3 ADD 3 EXPONENTIATION 2";

        final MathOperationApplier mathOperationApplier = new MathOperationApplier();

        Interpreter interpreter = new PythonStyleWithoutOrderMathOperationsInterpreter(mathOperationApplier);

        String result = interpreter.interpret(input1);
        System.out.println(result);

        interpreter = new WordsWithoutOrderMathOperationsInterpreter(mathOperationApplier);
        result = interpreter.interpret(input2);
        System.out.println(result);

    }

}
