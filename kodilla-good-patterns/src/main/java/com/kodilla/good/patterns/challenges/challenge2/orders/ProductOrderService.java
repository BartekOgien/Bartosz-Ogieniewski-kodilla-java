package com.kodilla.good.patterns.challenges.challenge2.orders;

import com.kodilla.good.patterns.challenges.challenge2.products.Product;
import com.kodilla.good.patterns.challenges.challenge2.users.User;

import java.time.LocalDateTime;

public class ProductOrderService implements ShoppingService {

    public boolean buy(User user, Product product, LocalDateTime dateOfOrder) {
        System.out.println("User: " + user + " create order for " + product + " . Date: " + dateOfOrder);
        return true;
    }
}
