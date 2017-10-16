package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .rollWithSezam(true)
                .burgersQuantity(2)
                .sauce("barbecue")
                .ingredients("onion")
                .ingredients("tomatoe")
                .build();
        System.out.println(bigmac);

        //When
        int ingredientsQuantity = bigmac.getIngredients().size();
        boolean isRoll = bigmac.isRoll();
        String sauce = bigmac.getSauce();
        int burgerNumbers = bigmac.getBurgers();

        //Then
        Assert.assertEquals(ingredientsQuantity, 2);
        Assert.assertEquals(isRoll, true);
        Assert.assertEquals(sauce, "barbecue");
        Assert.assertEquals(burgerNumbers, 2);
    }
}
