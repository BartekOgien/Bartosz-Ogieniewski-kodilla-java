package com.kodilla.good.patterns.challenges.challenge3.orders;

public class OrderRepository {

    public void saveOrderInArchive(OrderRequest order) {
        System.out.println("Save order in archive: " + order.getSupplierName() + " , product: " + order.getProduct() + " /Date: " + order.getDateOfOrder());
    }
}
