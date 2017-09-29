package com.kodilla.good.patterns.challenges.challenge3.suppliers;

import com.kodilla.good.patterns.challenges.challenge3.DTO.OrderDTO;
import com.kodilla.good.patterns.challenges.challenge3.orders.OrderRepository;

public class HealthyShop implements SupplierShop {

    private final String name = "Healthy Shop";

    public void process(OrderDTO orderDTO) {
        if(orderDTO.getOrderConfirmation()) {
            System.out.println("Order confirm and waited for realized");
            new OrderRepository().saveOrderInArchive(orderDTO.getOrder());
        }
    }

    public String getName() {
        return name;
    }
}
