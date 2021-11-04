package com.productManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productManagment.model.Product;

@Repository
public interface productRepository extends JpaRepository<Product,Integer> {

}
