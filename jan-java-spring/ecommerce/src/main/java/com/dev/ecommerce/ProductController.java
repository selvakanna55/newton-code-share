package com.dev.ecommerce;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    List<Product> products = new ArrayList<>();

    ProductController() {
        products.add(new Product(1, "apple", 20));
        products.add(new Product(2, "mango", 10));
        products.add(new Product(3, "orange", 25));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/products")
    List<Product> getAllProducts() {
        return products;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/products/{id}")
    Product getProductById(@PathVariable("id") Integer productId) {
        return products.stream().filter(p -> productId == p.id).findFirst().get();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/products")
    boolean addProduct(@RequestBody Product prod) {
        products.add(prod);
        return true;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
    boolean deleteProduct(@PathVariable("id") Integer productId) {
        Product prod = products.stream().filter(p -> productId == p.id).findFirst().get();
        products.remove(prod);
        return true;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/products")
    boolean updateProduct(@RequestBody Product prod) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id == prod.id) {
                products.set(i, prod);
                break;
            }
        }
        return true;
    }


}
