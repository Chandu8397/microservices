package com.coforge.training.shopstop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.shopstop.model.Order;

/*
* Author:Mekapothula.Reddy
* Date:29 Nov 2024
* Time:3:12:31 pm
* Project:order-service
*/

public interface OrderRepository extends JpaRepository<Order, Long> {

}
