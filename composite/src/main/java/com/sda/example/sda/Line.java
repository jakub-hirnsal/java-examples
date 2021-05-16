package com.sda.example.sda;

public interface Line {
    void draw(double lengthInPixels);
    void setStartingPosition(Point position);
    Point getStartingPoint();
}