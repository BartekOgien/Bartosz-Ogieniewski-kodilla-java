package com.kodilla.good.patterns.challenges.challenge3.suppliers;

import com.kodilla.good.patterns.challenges.challenge3.DTO.OrderDTO;

public interface SupplierShop {
    void process(OrderDTO orderDTO);
    String getName();
}
