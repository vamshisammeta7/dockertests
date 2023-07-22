package com.project.springsampleproject.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.springsampleproject.entity.Product;

@RestController
public class SampleController {
	
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		Product p1 = new Product(1,"name",123);
		Product p2 = new Product(2,"name",123);
	  List<Product> product =	Arrays.asList(p1,p2);
		return product;
		
	}
	
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable Integer id) {
		if (id < 100) {
			return "list unvavailable";
		}
		else
		return "ok";
		
	}
	
	@PostMapping("/product")
	public String saveProduct(@RequestBody Product p) {
		System.out.println(p);
		return "success";
		
	}
	
	
	

}
