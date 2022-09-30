package com.dev.ecommerce;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
// repository will contains logic to get / crate data with databae

}
