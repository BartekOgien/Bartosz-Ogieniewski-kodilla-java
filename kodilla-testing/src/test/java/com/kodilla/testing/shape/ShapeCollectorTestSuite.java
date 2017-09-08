package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.shape.ShapeCollector;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void TestAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(5.5));
        //Then
        Assert.assertEquals(1, shapeCollector.figureList.size());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(3.4);
        //When
        boolean testExist = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertFalse(testExist);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(2);
        shapeCollector.addFigure(circle);
        //When
        boolean testRemove = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(testRemove);
        Assert.assertEquals(0, shapeCollector.figureList.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(6);
        shapeCollector.addFigure(circle);
        //When
        Shape retrieveFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, retrieveFigure);
    }
}
