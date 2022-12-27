package com.example.demo1.controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.CustomerDto;
import com.example.demo1.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	ArrayList<CustomerDto> customerList = new ArrayList<CustomerDto>();

	@PostMapping("/create")
	public void addCustomer(@RequestBody CustomerDto customer) {

		this.customerList = this.customerService.createCustomer(customer);

		System.out.println("Customer added Successfully..."  );
		printCustomer(customerList);
	}

	@PostMapping("/update")
	public void updateCustomer(@RequestBody CustomerDto customer) {
		this.customerList = this.customerService.updateCustomer(customer);

		System.out.println("Customer updated Successfully..."  );
		printCustomer(customerList);
	}

	
	public void printCustomer(ArrayList<CustomerDto> customerList) {
		
		 Iterator itr=customerList.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
			  CustomerDto customer=(CustomerDto)itr.next();  
		    System.out.println(customer.getId()+" "+customer.getName());  
		  }  
	}
}
