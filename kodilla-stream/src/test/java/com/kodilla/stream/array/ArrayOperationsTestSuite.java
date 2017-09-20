package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numberList = new int[20];
        for (int i=0; i<numberList.length; i++) {
            numberList[i] = i*10;
        }
        //When
        double resultGetAverage = ArrayOperations.getAverage(numberList);
        //Then
        Assert.assertEquals(95.0, resultGetAverage, 0.01);
    }
}
