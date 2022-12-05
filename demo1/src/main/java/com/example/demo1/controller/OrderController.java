package com.example.demo1.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo1.dto.ProductDto;
import com.example.demo1.service.ProductService;

public class OrderController {
	
	@Autowired
	private ProductService productService;

//	@PostMapping("/create")
//	public String createOrder(@RequestBody OrderDto o) {
//		OrderService.createOrder(o);
//		return "Order Created";
//	}

//	@PutMapping("/update")
//	public OrderDto updateOrder(@RequestBody OrderDto o) {
//		return OrderService.updateOrder(o.getOrder(), o.getOrderName());
//	}
	
//	@PutMapping("/delete")
//	public OrderDto deleteOrder(@RequestBody OrderDto o) {
//		return orderService.updatePr(p.getName(), p.getPrice());
//	}
//
//
//	// Read getMapping
//	@GetMapping("/getproduct")
//	public ArrayList<ProductDto> getProduct() {
//		return productService.getAllProducts();
//	}
//
//	// update putMapping
//	// ProductDtodelete deleteMapping
//
//}


}
