package com.example.demo.product;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    List<Product> productList = new ArrayList<>();

    List<Product> getAllProducts() {
        return productList;
    }

    Product getProductById(@PathVariable int id) {
        for (Product prod : productList) {
            if (prod.getId() == id) {
                return prod;
            }
        }
        return null;
    }

    Product addNewProduct(@RequestBody Product prod) {
        productList.add(prod);
        return prod;
    }

    boolean deleteProductById(@PathVariable int id) {
        for (Product prod : productList) {
            if (prod.getId() == id) {
                productList.remove(prod);
                return true;
            }
        }
        return false;
    }

    boolean updateProduct(@RequestBody Product prod) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == prod.id) {
                productList.set(i, prod);
                return true;
            }
        }
        return false;
    }

}
