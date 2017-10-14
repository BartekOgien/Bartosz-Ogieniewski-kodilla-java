package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTestSuite {

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPP);
        //Then
        Assert.assertEquals("ChocolateBuy", shopping.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVE);
        //Then
        Assert.assertEquals("DriveToMiami", driving.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINT);
        //Then
        Assert.assertEquals("PaintHorse", painting.getTaskName());
    }
}
