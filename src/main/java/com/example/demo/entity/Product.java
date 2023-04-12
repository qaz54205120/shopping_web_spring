package com.example.demo.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Indexed;

public class Product {

    private int id;
    private String name;
    private int price;
    

    public Product(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //{get; set;}
    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
