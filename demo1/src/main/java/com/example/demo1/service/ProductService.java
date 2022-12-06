package com.example.demo1.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo1.dto.ProductDto;

@Service
public class ProductService {

	private final ArrayList<ProductDto> productList = new ArrayList<ProductDto>();

	@RequestMapping
	public void createProduct(ProductDto productDto) {
		System.out.println("productDto" + productDto.getName());
		productList.add(productDto);
	}

	public ArrayList<ProductDto> getAllProducts() {
		return productList;
	}

	public ProductDto updatePriceFo rProduct(String productName, Integer price) {
		System.out.println("Inside update price method");
		for (ProductDto productDto : productList) {
			if (productDto.getName().equals(productName)) {
				System.out.println("Input production name got matched");
				productDto.setPrice(price);
				return productDto;
			}
		}
		System.out.println("No product exists with name " + productName);
		return null;
	}
}

/*
 * // * @RequestMapping public void readProduct(ProductDto p) { // *
 * product.Service.addProduct(product); //
 */
//
//}
