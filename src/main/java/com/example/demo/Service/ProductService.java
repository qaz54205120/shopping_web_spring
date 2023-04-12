package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ProductDao;
import com.example.demo.entity.Product;

@Service
public class ProductService {
    
    @Autowired
    ProductDao productDao;
    public void addProduct(Product product){
        productDao.addProduct(product);
    }
}
