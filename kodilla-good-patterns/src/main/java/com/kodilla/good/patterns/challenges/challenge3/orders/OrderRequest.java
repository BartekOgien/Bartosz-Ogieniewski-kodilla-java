package com.kodilla.good.patterns.challenges.challenge3.orders;

import com.kodilla.good.patterns.challenges.challenge3.products.Product;

import java.time.LocalDateTime;

public class OrderRequest {

    private String supplierName;
    private Product product;
    private LocalDateTime dateOfOrder;

    public OrderRequest(String supplierName, Product product, LocalDateTime dateOfOrder) {
        this.supplierName = supplierName;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }
}
