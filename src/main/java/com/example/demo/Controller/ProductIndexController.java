package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductService;
import com.example.demo.entity.Product;

import org.springframework.ui.Model;

@Controller
public class ProductIndexController {
    
    @Autowired
    ProductService productService;

    // @RequestMapping("/shopList")
    @RequestMapping("/")
    public String index(@RequestParam(value="title", required=false, defaultValue="test") String title, Model model){
        List<Product> productList = productService.findAll();
        System.out.println(productList);
        model.addAttribute("products", productList);
        return "index";
    }
}
