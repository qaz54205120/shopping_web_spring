package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebcommProjectApplication {


	public static void main(String[] args) {
		SpringApplication.run(WebcommProjectApplication.class, args);
	}

	@GetMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue = "hello") String name){

        return String.format("%s", name);
    }

}
