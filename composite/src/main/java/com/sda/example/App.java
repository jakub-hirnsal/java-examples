package com.sda.example;

import com.sda.example.sda.CompoundLine;
import com.sda.example.sda.DottedLine;
import com.sda.example.sda.Point;
import com.sda.example.sda.SolidLine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Point point = new Point(0, 0);

        SolidLine solidLine = new SolidLine();
        DottedLine dottedLine = new DottedLine();

        CompoundLine compoundLine = new CompoundLine();
        CompoundLine compoundLine1 = new CompoundLine();

        compoundLine.addLine(solidLine);
        compoundLine.addLine(dottedLine);
        compoundLine.addLine(compoundLine1);

    }
}
