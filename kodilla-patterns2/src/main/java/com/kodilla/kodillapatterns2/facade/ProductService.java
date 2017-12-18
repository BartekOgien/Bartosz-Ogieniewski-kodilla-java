package com.kodilla.kodillapatterns2.facade;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {
    public BigDecimal getPrice(Long ProductId) {
        Random genertor = new Random();
        return new BigDecimal(genertor.nextInt(100000/100));
    }

}
