package com.sda.example.sda;

import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class Point {
    private final int x;
    private final int y;
}