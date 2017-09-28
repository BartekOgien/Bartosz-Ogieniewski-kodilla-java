package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ShopRequest {

    public User user;
    public Product product;
    public LocalDateTime dateOfOrder;

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public ShopRequest(User user, Product product, LocalDateTime dateOfOrder) {

        this.user = user;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
    }
}
