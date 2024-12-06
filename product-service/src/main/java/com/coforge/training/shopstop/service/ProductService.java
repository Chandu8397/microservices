package com.coforge.training.shopstop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.shopstop.model.Product;
import com.coforge.training.shopstop.repository.ProductRepository;

/*
* Author:Mekapothula.Reddy
* Date:29 Nov 2024
* Time:1:04:51 pm
* Project:product-service
*/
@Service
public class ProductService {
	
	   
	   @Autowired
		private ProductRepository prepo;
		
		public Product saveProduct(Product p)
		{
			return prepo.save(p);  //Invokes pre-defined method save() of JPA repository
		}
		
		public List<Product> listAll(){
			return prepo.findAll();  //Invokes pre-defined method findAll() of JPA repository
		}
		
		// Optional return type is to handle Null Pointer Exception
	   public Optional<Product> getSingleProduct(long pid) {
		   return prepo.findById(pid);            //Invokes pre-defined method findById() of JPA repository
	   }

}
