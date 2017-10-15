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
        //Then
        Assert.assertEquals(ingredientsQuantity, 2);
    }
}
