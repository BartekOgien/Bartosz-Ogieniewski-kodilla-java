package com.kodilla.good.patterns.challenges;

public class Product {

    private String productname;

    public Product(String productname) {

        this.productname = productname;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productname='" + productname + '\'' +
                '}';
    }

    public String getProductname() {
        return productname;
    }
}
