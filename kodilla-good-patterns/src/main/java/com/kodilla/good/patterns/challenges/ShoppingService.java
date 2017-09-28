package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ShoppingService {
    boolean buy(User user, Product product, LocalDateTime dateOfOrder);
}
