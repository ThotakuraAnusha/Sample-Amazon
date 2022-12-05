package com.example.demo1.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo1.dto.CustomerDto;
import com.example.demo1.dto.ProductDto;
@Service
public class CustomerService {

	private ArrayList<CustomerDto> customerList=new ArrayList<CustomerDto>();

	public ArrayList<CustomerDto> createCustomer(CustomerDto customerDto) { 
		//System.out.println("customerDto" + customerDto.getName());
        this.customerList.add(customerDto);
		return  this.customerList;
	}

	 
	 
}