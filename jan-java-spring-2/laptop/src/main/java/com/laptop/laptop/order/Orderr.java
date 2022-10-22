package com.laptop.laptop.order;

import com.laptop.laptop.product.Product;
import com.laptop.laptop.user.User;

import javax.persistence.*;

@Entity
public class Orderr {
    @Id
    int id;

    public Orderr() {
    }

    public Orderr(int id, Product product, User user) {
        this.id = id;
        this.prod = product;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }
//
    public User getSysUser() {
        return user;
    }

    public void setSysUser(User sysUser) {
        this.user = user;
    }

    @ManyToOne
    Product prod;
    @ManyToOne
    User user;
}
