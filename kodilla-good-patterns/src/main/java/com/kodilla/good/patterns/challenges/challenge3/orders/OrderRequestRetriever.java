package com.kodilla.good.patterns.challenges.challenge3.orders;

import com.kodilla.good.patterns.challenges.challenge3.products.Product;
import com.kodilla.good.patterns.challenges.challenge3.suppliers.SupplierShop;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(SupplierShop supplier) {
        Product product = new Product("Potatoes", 50);
        LocalDateTime dateOfOrder = LocalDateTime.now();

        return new OrderRequest(supplier.getName(), product, dateOfOrder);
    }
}
