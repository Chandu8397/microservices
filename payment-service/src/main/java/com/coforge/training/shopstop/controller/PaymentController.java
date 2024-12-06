package com.coforge.training.shopstop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.shopstop.service.CartRestConsumer;

/*
* Author:Mekapothula.Reddy
* Date:29 Nov 2024
* Time:12:05:02 pm
* Project:payment-service
*/

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private CartRestConsumer consumer;
	
	//Access cart service from payment-service
	
	//http://localhost:8989/payment-service/data
	@GetMapping("/data")
	public String getPaymentData() {
		return "FROM PAYMENT-SERVICE:"+consumer.getCartInfo();
		
	}
	

}
