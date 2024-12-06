package com.coforge.training.shopstop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* Author:Mekapothula.Reddy
* Date:28 Nov 2024
* Time:5:16:52 pm
* Project:cart-service
*/

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@GetMapping("/getCartData")
	public String helloWorld() {
		return "Hello World from cart - MicroService";
		
		
	}

}
