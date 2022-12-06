package com.example.demo1.dto;

public class OrderDto {
	private int orderId;
	private int orderquantity;
	private String orderQuality;
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
