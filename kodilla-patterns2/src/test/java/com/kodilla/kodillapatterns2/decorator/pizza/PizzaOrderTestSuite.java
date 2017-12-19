package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaAdditionalCheese() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new CheeseDecorator(order);
        //When
        BigDecimal pizzaCost = order.getCost();
        String pizzaDescription = order.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(18), pizzaCost);
        Assert.assertEquals("Pizza + additional cheese", pizzaDescription);
    }

    @Test
    public void testPizzaCheeseChickenHam() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new CheeseDecorator(order);
        order = new ChickenDecorator(order);
        order = new HamDecorator(order);
        //When
        BigDecimal pizzaCost = order.getCost();
        String pizzaDescription = order.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(24), pizzaCost);
        Assert.assertEquals("Pizza + additional cheese + chicken + ham", pizzaDescription);
    }
}
