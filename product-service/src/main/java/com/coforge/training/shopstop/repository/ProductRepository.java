package com.coforge.training.shopstop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.shopstop.model.Product;

/*
* Author:Mekapothula.Reddy
* Date:29 Nov 2024
* Time:1:03:06 pm
* Project:product-service
*/

public interface ProductRepository extends JpaRepository<Product, Long> {

}
