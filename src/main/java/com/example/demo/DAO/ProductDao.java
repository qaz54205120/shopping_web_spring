package com.example.demo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public class ProductDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(Product product){
        System.out.println("EXECUTE");

        jdbcTemplate.update("INSERT INTO fruits_products(id, name, price) VALUE (?,?,?)", product.getId(), product.getName(),product.getPrice());
    }

}
