package com.productManagment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productManagment.model.Product;
import com.productManagment.service.productService;

@RestController
@RequestMapping("/product")
public class productController{

	@Autowired
	productService productService;
	
	@GetMapping("/")
	public void getAllProducts()
	{
		List<Product> p= productService.getallProducts();
		System.out.println(p);
//		return new ResponseEntity<>(p,HttpStatus.OK);
	}
}
