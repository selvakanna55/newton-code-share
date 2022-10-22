package com.laptop.laptop.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    boolean addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/products")
    boolean updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    boolean deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

}
