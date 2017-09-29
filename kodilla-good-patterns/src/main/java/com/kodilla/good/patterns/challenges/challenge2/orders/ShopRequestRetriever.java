package com.kodilla.good.patterns.challenges.challenge2.orders;

import com.kodilla.good.patterns.challenges.challenge2.products.Product;
import com.kodilla.good.patterns.challenges.challenge2.users.User;

import java.time.LocalDateTime;

public class ShopRequestRetriever {

    public ShopRequest retrieve() {

        User user = new User("Bartosz", "Ogien");
        Product product = new Product("Book 1");
        LocalDateTime dateOfOrder = LocalDateTime.now();

        return new ShopRequest(user, product, dateOfOrder);
    }
}
