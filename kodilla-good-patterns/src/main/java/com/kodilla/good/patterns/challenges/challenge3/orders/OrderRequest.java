package com.kodilla.good.patterns.challenges.challenge3.orders;

import com.kodilla.good.patterns.challenges.challenge3.products.Product;

public class OrderRequest {

    private String supplierName;
    private Product product;
    private String dateOfOrder;

    public OrderRequest(String supplierName, Product product, String dateOfOrder) {
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

    public String getDateOfOrder() {
        return dateOfOrder;
    }
}
