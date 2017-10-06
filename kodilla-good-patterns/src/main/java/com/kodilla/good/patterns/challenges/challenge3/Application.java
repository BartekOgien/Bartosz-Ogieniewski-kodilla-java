package com.kodilla.good.patterns.challenges.challenge3;

import com.kodilla.good.patterns.challenges.challenge3.orders.OrderRequest;
import com.kodilla.good.patterns.challenges.challenge3.orders.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.challenge3.orders.OrderService;
import com.kodilla.good.patterns.challenges.challenge3.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.challenge3.suppliers.SupplierShop;

public class Application {

    public static void main (String[] args) throws java.lang.Exception {

        SupplierShop supplier = new ExtraFoodShop();
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve(supplier);
        supplier.process(new OrderService().confirmOrder(orderRequest));
    }
}
