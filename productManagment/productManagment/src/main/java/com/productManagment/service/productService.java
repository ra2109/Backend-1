package com.productManagment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.productManagment.model.Product;
import com.productManagment.repository.productRepository;

@Service
 public class productService {
	@Autowired
	productRepository productRepository;
	
	
	
	public List<Product> getallProducts()
	{
		
		Product p=new Product();
		p.setId(1);
		p.setName("Vaseline");
		p.setPrice(4000);
		p.setDescription("ok to use");
		List<Product> p1=new ArrayList<>();
		p1.add(p);
		return p1;
			
			
	}

}
