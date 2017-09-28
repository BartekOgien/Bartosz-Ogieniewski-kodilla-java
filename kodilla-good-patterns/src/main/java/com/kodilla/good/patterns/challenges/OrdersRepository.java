package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrdersRepository implements ShoppingRepository {
    @Override
    public void saveShoppingOrder(User user, Product product, LocalDateTime dateOfOrder) {
        System.out.println("Save order in archive");
    }
}
