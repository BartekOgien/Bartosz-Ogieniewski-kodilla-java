package com.kodilla.good.patterns.challenges.challenge2.orders;

import com.kodilla.good.patterns.challenges.challenge2.products.Product;
import com.kodilla.good.patterns.challenges.challenge2.users.User;

import java.time.LocalDateTime;

public interface ShoppingService {
    boolean buy(User user, Product product, LocalDateTime dateOfOrder);
}
