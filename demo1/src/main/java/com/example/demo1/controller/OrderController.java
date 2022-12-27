package com.example.demo1.controller;

import com.example.demo1.service.OrderService;

public class OrderController {

	private OrderService orderService;

	public OrderController(OrderService orderService) {
	this.orderService=orderService;
	
	System.out.println("Order added Successfully..."+orderService);
}
   
	//@PostMapping("/update")
   //public String placeOrder(@RequestBody Order order) {
   // order.setOrderId();
  
//	System.out.println("Order added Successfully..."+orderService);
//  
//   }  
//
//

}
