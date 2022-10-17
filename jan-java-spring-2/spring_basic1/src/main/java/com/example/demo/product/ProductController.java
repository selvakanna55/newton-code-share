package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    // = new ProductService();

    @GetMapping("/products")
    List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    Product addNewProduct(@RequestBody Product prod) {
        return productService.addNewProduct(prod);
    }

    @DeleteMapping("/products/{id}")
    boolean deleteProductById(@PathVariable int id) {
        return productService.deleteProductById(id);
    }

    @PutMapping("/products")
    boolean updateProduct(@RequestBody Product prod) {
        return productService.updateProduct(prod);
    }


}
