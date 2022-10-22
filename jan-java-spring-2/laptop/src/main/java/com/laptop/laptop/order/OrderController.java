package com.laptop.laptop.order;

import com.laptop.laptop.product.Product;
import com.laptop.laptop.product.ProductService;
import com.laptop.laptop.user.User;
import com.laptop.laptop.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;

    @PostMapping("/order/{prodId}/{userId}/{orderId}")
    boolean addUser(@PathVariable int prodId, @PathVariable int userId, @PathVariable int orderId) {
        User user = userService.userRepository.findById(userId).get();
        Product product = productService.getProductById(prodId);
        Orderr ord = new Orderr(orderId, product, user);
        orderRepository.save(ord);
        return true;
    }

    @GetMapping("/order")
    List<Orderr> getAllUsers() {
        return (List<Orderr>) orderRepository.findAll();
    }
}
