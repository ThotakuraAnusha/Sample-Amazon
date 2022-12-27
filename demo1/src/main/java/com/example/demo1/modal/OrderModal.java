package com.example.demo1.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderModal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int orderId;
	private int orderquantity;
	private String orderQuality;

	public OrderModal() {
		super();

	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderquantity() {
		return orderquantity;
	}

	public void setOrderquantity(int orderquantity) {
		this.orderquantity = orderquantity;
	}

	public String getOrderQuality() {
		return orderQuality;
	}

	public void setOrderQuality(String orderQuality) {
		this.orderQuality = orderQuality;
	}

}
