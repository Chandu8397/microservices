package com.coforge.training.shopstop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/*
* Author:Mekapothula.Reddy
* Date:29 Nov 2024
* Time:11:50:40 am
* Project:payment-service
* ------
* CartRestConsumer and discover Service Instance of Cart Service to 
* communicate and get data. 
* In order to do this, we will take help of DiscoveryClient.
*/


@Component
public class CartRestConsumer {
	
	@Autowired
	private DiscoveryClient client;		//Used for Communication b/w microServices
	
	public String getCartInfo() {
		
		//get Service Instance list using serviceID
		List<ServiceInstance> siList = client.getInstances("CART-SERVICE");
		
		//read manually one instance from index #0
		ServiceInstance si = siList.get(0);
		
		//read URI and Add Path that returns url
		String url = si.getUri() +"/cart/getCartData";
		
		//create object for Rest Template
		//Rest client - consuming web api / rest-api
		RestTemplate rt = new RestTemplate();
		
		//make HTTP call and get Response Data
		String response = rt.getForObject(url, String.class);
		
		//return response back to consumer
		return response;
 	}

}
