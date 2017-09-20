package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("11111111111111111111") );
        Country germany = new Country("Germany", new BigDecimal("11111111111111111111") );
        Country france = new Country("France", new BigDecimal("11111111111111111111") );
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        Country uganda = new Country("Uganda", new BigDecimal("11111111111111111111") );
        Country dupanda = new Country("Dupanda", new BigDecimal("11111111111111111111") );
        Country egypt = new Country("Egypt", new BigDecimal("11111111111111111111") );
        Continent africa = new Continent("Africa");
        africa.addCountry(uganda);
        africa.addCountry(dupanda);
        africa.addCountry(egypt);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedResult = new BigDecimal("66666666666666666666");
        Assert.assertEquals(expectedResult, result);
    }
}
