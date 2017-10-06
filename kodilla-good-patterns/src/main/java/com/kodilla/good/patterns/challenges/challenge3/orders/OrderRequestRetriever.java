package com.kodilla.good.patterns.challenges.challenge3.orders;

import com.kodilla.good.patterns.challenges.challenge3.products.Product;
import com.kodilla.good.patterns.challenges.challenge3.suppliers.SupplierShop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderRequestRetriever {

    public OrderRequest retrieve(SupplierShop supplier) {
        Product product = new Product("Potatoes", 50);
        LocalDateTime dateOfOrder = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateOfOrderFormat = dateOfOrder.format(formatter);

        return new OrderRequest(supplier.getName(), product, dateOfOrderFormat);
    }
}
