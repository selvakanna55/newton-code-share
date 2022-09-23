package com.dev.ecommerce;

import java.util.List;

public class Order {
    List<Product> products;
    int value;


    public Order() {
    }

    public Order(List<Product> products, int value) {
        this.products = products;
        this.value = value;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}

// create an order
// retrieve the order