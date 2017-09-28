package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ShopRequestRetriever {

    public ShopRequest retrieve() {

        User user = new User("Bartosz", "Ogien");
        Product product = new Product("Book 1");
        LocalDateTime dateOfOrder = LocalDateTime.now();

        return new ShopRequest(user, product, dateOfOrder);
    }
}
