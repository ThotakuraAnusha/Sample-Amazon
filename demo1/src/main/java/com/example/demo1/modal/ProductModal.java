package com.example.demo1.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductModal {
	
	 @Id 
	 @GeneratedValue(strategy = GenerationType.AUTO) 
	private String name;
	private int price;

	public ProductModal() {
		super();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
