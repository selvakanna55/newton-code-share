package com.dev.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sound.sampled.Port;
import java.util.*;

//public interface ProductRepository extends CrudRepository<Product, Integer> {
@Repository
public class ProductRepository {
    @Autowired
    JdbcTemplate jdbc;

    List<Product> findAll() {
        return jdbc.query("select * from product", new BeanPropertyRowMapper<>(Product.class));
    }

    void deleteById(Integer id) {
        jdbc.execute("delete from product where id=" + id);
    }

    void save(Product prod) {
        String query = "insert product values(" + prod.id + ", '" + prod.name + "', " + prod.price + ")";
        //                insert product values(  3     ,   '  rice       ',  60           );
        jdbc.execute(query);
    }

    void update(Product prod) {
        String query = "update product set name='" + prod.name + "',price=" + prod.price + "  where id=" + prod.id;
        jdbc.execute(query);
    }

}
