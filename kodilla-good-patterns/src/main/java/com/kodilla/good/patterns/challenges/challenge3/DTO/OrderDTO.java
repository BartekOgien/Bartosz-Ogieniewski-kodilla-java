package com.kodilla.good.patterns.challenges.challenge3.DTO;

import com.kodilla.good.patterns.challenges.challenge3.orders.OrderRequest;

public class OrderDTO {

    public OrderRequest order;
    public boolean orderConfirmation;

    public OrderDTO(OrderRequest order, boolean orderConfirmation) {
        this.order = order;
        this.orderConfirmation = orderConfirmation;
    }

    public OrderRequest getOrder() {
        return order;
    }

    public boolean getOrderConfirmation() {
        return orderConfirmation;
    }
}
