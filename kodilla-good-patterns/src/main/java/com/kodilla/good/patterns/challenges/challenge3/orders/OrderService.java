package com.kodilla.good.patterns.challenges.challenge3.orders;

import com.kodilla.good.patterns.challenges.challenge3.DTO.OrderDTO;

public class OrderService {

    public OrderDTO confirmOrder(OrderRequest order) {
        System.out.println("Checked order for supplier: " + order.getSupplierName() + " , product: " + order.getProduct() + " //Date: " + order.getDateOfOrder());
        return new OrderDTO(order, true);
    }
}
