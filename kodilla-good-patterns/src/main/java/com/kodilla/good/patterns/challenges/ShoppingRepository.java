package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ShoppingRepository {
    void saveShoppingOrder(User user, Product product, LocalDateTime dateOfOrder);
}
