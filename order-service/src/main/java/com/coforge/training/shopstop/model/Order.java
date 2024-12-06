package com.coforge.training.shopstop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
* Author:Mekapothula.Reddy
* Date:29 Nov 2024
* Time:3:07:10 pm
* Project:order-service
*/
@Entity
@Table(name="/orders")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Long productId;
    private int quantity;
    private double totalPrice;

}
