package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static double calculateArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    public static double calculateArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }
}
