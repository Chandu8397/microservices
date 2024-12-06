package com.coforge.training.shopstop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/*
* Author:Mekapothula.Reddy
* Date:29 Nov 2024
* Time:12:59:25 pm
* Project:product-service
*/
@Entity
@Getter
@Setter
public class Product {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String description;
	

}
