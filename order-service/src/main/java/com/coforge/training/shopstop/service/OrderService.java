package com.coforge.training.shopstop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.shopstop.model.Order;
import com.coforge.training.shopstop.repository.OrderRepository;

/*
* Author:Mekapothula.Reddy
* Date:29 Nov 2024
* Time:3:13:26 pm
* Project:order-service
*/

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepo; 
	
	public Order saveOrder(Order myOrder) {
		return orderRepo.save(myOrder); 
	}
	
	public List<Order> getAllOrders(){
		return orderRepo.findAll();
	}

}
