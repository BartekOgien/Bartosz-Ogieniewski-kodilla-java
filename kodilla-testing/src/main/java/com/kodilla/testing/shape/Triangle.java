package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private final String name = "Triangle";
    private double field;

    public Triangle(double field) {
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return field;
    }


}
