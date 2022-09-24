package com.dev.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired // automatically crate an obj and assign
    ProductRepository productRepository;

    boolean addProduct(Product product) {
        productRepository.save(product);
        return true;
    }

    List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }

    Product getById(Integer id) {
        return productRepository.findById(id).get();
    }

    boolean updateProduct(Product prod) {
        productRepository.save(prod);
        return true;
    }


    boolean deleteProduct(Integer id) {
        productRepository.deleteById(id);
        return true;
    }

}
