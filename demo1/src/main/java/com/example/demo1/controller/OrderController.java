package com.example.demo1.controller;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo1.service.OrderService;

public class OrderController {

	private OrderService orderService;

	public OrderController(OrderService orderService)
	this.orderService=orderService;
	
	System.out.println("Order added Successfully..."+orderService);
}
   @Order
	@PostMapping()
   public String placeOrder(@RequestBody Order order)
    order.setOrderId(order);
  
	System.out.println("Order added Successfully..."+orderService);


}
