package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figureList = new ArrayList<Shape>();


    public void addFigure(Shape shape) {
        figureList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(figureList.contains(shape)) {
            figureList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape figure = null;
        if(n>=0 && n<=figureList.size()-1) {
            figure = figureList.get(n);
        }
        return figure;
    }
}
