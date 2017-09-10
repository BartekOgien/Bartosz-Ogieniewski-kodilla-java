package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figureList = new ArrayList<Shape>();


    public void addFigure(Shape shape) {
        figureList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return figureList.remove(shape);
    }

    public Shape getFigure(int n) {
        return figureList.get(n);
    }
}
