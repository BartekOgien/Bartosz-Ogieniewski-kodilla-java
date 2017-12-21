package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class ObserverTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Participant sanEscobar = new Participant("San Escobar");
        Participant johnSmith = new Participant("John Smith");
        Participant lukeSkyrunner = new Participant("Luke Skyrunner");
        Menthor mickLee = new Menthor("Mick Lee");
        Menthor robertWoo = new Menthor("Robert Woo");
        sanEscobar.registerObserver(mickLee);
        johnSmith.registerObserver(robertWoo);
        lukeSkyrunner.registerObserver(robertWoo);
        //When
        sanEscobar.addTask("Task 20.1");
        sanEscobar.addTask("Task 20.2");
        johnSmith.addTask("Task 19.2");
        johnSmith.addTask("Task 19.3");
        johnSmith.addTask("Task 19.4");
        lukeSkyrunner.addTask("Task 23.1");
        //Then
        Assert.assertEquals(2, mickLee.getUpdateCount());
        Assert.assertEquals(4, robertWoo.getUpdateCount());
    }
}
