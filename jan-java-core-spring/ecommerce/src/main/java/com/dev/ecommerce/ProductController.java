package com.dev.ecommerce;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;


    @RequestMapping(method = RequestMethod.GET, value = "/products")
    List<Product> getAllProducts() {
        return productService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/products/{id}")
    Product getProductById(@PathVariable("id") Integer productId) {
        return productService.getById(productId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/products")
    boolean addProduct(@RequestBody Product prod) {
        return productService.addProduct(prod);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
    boolean deleteProduct(@PathVariable("id") Integer productId) {
        return productService.deleteProduct(productId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/products")
    boolean updateProduct(@RequestBody Product prod) {
        return productService.updateProduct(prod);
    }


}
