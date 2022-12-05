package com.example.demo1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.CustomerDto;
import com.example.demo1.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@PostMapping("/create")
	public void addCustomer(@RequestBody CustomerDto customer) {
		ArrayList<CustomerDto> customerList=this.customerService.createCustomer(customer);
      
		System.out.println("Customer added Successfully..."+customerList);
	}

//	@RequestMapping("/name ")
//	public List<CustomerDto> getAllCustomer()
//	{
//		return (CustomerDto.getAllCustomer());
//	}

//	@PostMapping("/create") 
//    public String createProduct(@RequestBody CustomerDto c){
//      { 
//       customer   Service.createCustomer(c); 
//
//    return"Customer name Created"
//      }
//  @RequestMapping(method=RequestMehod,POST,value ="/customer")
//	public void addTopic(@RequestBody Customer customer) {
//   customerService.addCustomer(Customer);
//  }
//   @RequestMapping(method=RequestMehod, PUT,value ="/customer/ {id}") 
//
//	public void updateCustomer(@RequestBody Customer customer,@pathvariable String id) {
//
//			customerService.updateCustomer(id,Customer);
//
//}
	}
