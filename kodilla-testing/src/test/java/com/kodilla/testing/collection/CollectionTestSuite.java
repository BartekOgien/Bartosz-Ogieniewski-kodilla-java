package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    static boolean test1 = true;

    @Before
    public void before() {
        if(test1) {
            System.out.println("Test begin: testOddNumbersExterminatorEmptyList");
        }
        else {
            System.out.println("Test begin: testOddNumbersExterminatorNormalList");
        }
    }

    @After
    public void after() {
        if(test1) {
            System.out.println("Test end: testOddNumbersExterminatorEmptyList");
        }
        else {
            System.out.println("Test end: testOddNumbersExterminatorNormalList");
        }
        test1 = false;
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddsNumbers = new OddNumbersExterminator();
        ArrayList<Integer> oddTest = new ArrayList<Integer>();
        //When
        ArrayList<Integer> emptyList = oddsNumbers.exterminate(oddTest);
        boolean empty = emptyList.isEmpty();
        //Then
        Assert.assertTrue(empty);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddsNumbers = new OddNumbersExterminator();
        ArrayList<Integer> oddExterminator = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
            oddExterminator.add(i);
        }
        //When
        ArrayList<Integer>oddsExterminateResult = oddsNumbers.exterminate(oddExterminator);
        //Then
        for (Integer testNumber: oddsExterminateResult) {
            Assert.assertTrue(testNumber%2==0);
        }
    }
}
