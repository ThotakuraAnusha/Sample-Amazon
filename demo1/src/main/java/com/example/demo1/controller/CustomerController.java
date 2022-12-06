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
     @PutMapping("/update")
 
    public void updateCustomer(@RequestBody CustomerDto customer) {
    ArrayList<CustomerDto> customerList=this.customerService.updateCustomer(customer);
    	      
    System.out.println("Customer updated Successfully..."+customerList);
    		}
    	 
     }
