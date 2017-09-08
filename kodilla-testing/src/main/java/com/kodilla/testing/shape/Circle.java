package com.kodilla.testing.shape;

public class Circle implements Shape {
    private final String name = "Circle";
    private double field;
    private double radius;

    public Circle(double field) {
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return field;
    }


}
