package com.laptop.laptop.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    int id;
    String name;
    int qty;

    public Product() {
    }

    public Product(int id, String name, int qty, String description) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.description = description;
    }

    String description;

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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
