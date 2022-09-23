package com.dev.ecommerce;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {
    List<Order> orders = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET, value = "/orders")
    List<Order> getAllOrder() {
        return orders;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/orders")
    boolean addOrder(@RequestBody Order order) {
        orders.add(order);
        return true;
    }

}
