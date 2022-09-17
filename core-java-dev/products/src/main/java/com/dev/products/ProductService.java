package com.dev.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
//        List<Product> li = new ArrayList<>();
//        Iterator<Product> it  = productRepository.findAll().iterator();
//        while(it.hasNext()){
//            li.add(it.next());
//        }
//        return li;
    }

    boolean addProduct(Product product) {
        productRepository.save(product);
        return true;
    }

    public boolean updateProduct(Product prod) {
        productRepository.save(prod);
        return true;
    }


    public boolean deleteProduct(Integer id) {
        productRepository.deleteById(id);
        return true;
    }
}
