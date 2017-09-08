package com.kodilla.testing.shape;

public class Square implements Shape {
    private final String name = "Square";
    private double field;

    public Square(double field) {
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return field;
    }


}
