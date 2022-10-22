package com.laptop.laptop.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).get();
    }

    public boolean addProduct(Product product) {
        productRepository.save(product);
        return true;
    }

    public boolean updateProduct(Product product) {
        productRepository.save(product);
        return true;
    }

    public boolean deleteProduct(int id) {
        productRepository.deleteById(id);
        return true;
    }
}
