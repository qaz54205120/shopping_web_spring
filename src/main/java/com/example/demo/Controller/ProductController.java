package com.example.demo.Controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductService;
import com.example.demo.entity.Product;


@RestController
@RequestMapping("/product")
public class ProductController {
    // private final List<Product> productDB = new ArrayList<>();

    // @Autowired
    // Product product;
    // @RequestMapping("/test1")
    // public String hello(){
    //     product = new Product();
    //     product.setId(4);
    //     product.setName("test");
    //     product.setPrice(15);

    //     return "success";
    // }

    // @PostConstruct
    // private void initDB(){
    //     productDB.add(new Product(1, "apple", 10));
    //     productDB.add(new Product(2, "banana", 12));
    //     productDB.add(new Product(3, "watermelon", 20));
    // }

    // @GetMapping("/allProduct")
    // public ResponseEntity<List<Product>> getProducts(@RequestParam(value="keyword", defaultValue = "") String name) {
    //     List<Product> products = productDB.stream()
    //             .filter(p -> p.getName().toUpperCase().contains(name.toUpperCase()))
    //             .collect(Collectors.toList());

    //     return ResponseEntity.ok().body(products);
    // }

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable int id){
        return productService.findById(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        productService.deleteById(id);
    }
    

    
}
