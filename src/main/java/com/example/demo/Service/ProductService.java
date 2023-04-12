package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ProductRepository;
import com.example.demo.entity.Product;

@Service
public class ProductService {
    
    // @Autowired
    // ProductDao productDao;
    // public void addProduct(Product product){
    //     productDao.addProduct(product);
    // }

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(int id){
        return productRepository.findById(id).orElse(null);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void deleteById(int id){
        productRepository.deleteById(id);
    }
}
