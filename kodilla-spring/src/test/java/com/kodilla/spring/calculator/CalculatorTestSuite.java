package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(10.5, 6.5);
        double subResult = calculator.sub(8, 5);
        double mulResult = calculator.mul(2, 5);
        double divResult = calculator.div(15, 5);
        //Then
        Assert.assertEquals(addResult, 17, 0.1);
        Assert.assertEquals(subResult, 3, 0.1);
        Assert.assertEquals(mulResult, 10, 0.1);
        Assert.assertEquals(divResult, 3, 0.1);
    }
}
