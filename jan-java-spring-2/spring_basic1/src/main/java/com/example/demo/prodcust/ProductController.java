package com.example.demo.prodcust;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {
    List<Product> productList = new ArrayList<>();

    @PostMapping("/products")
    Product createProduct(@RequestBody Product prod) {
        productList.add(prod);
        return prod;
    }

    @GetMapping("/products")
    List<Product> getAllProducts() {
        int a=10;
        return productList;
    }

}
