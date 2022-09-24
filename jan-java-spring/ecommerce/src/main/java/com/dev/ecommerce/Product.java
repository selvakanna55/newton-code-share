package com.dev.ecommerce;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    int id;
    String name;
    int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product() {
    }


    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
