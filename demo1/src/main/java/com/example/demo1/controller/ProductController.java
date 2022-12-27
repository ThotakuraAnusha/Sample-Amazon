package com.example.demo1.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.ProductDto;
import com.example.demo1.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/create")
	public String createProduct(@RequestBody ProductDto p) {
		productService.createProduct(p);
		return "Product Createdsss";
	}

	@PutMapping("/update")
	public ProductDto updateProductPrice1(@RequestBody ProductDto p) {
		return productService.updatePriceForProduct(p.getName(), p.getPrice());
	}
	
	@PutMapping("/delete")
	public ProductDto deleteProductPrice(@RequestBody ProductDto p) {
		return productService.updatePriceForProduct(p.getName(), p.getPrice());
	}


	// Read getMapping
	@GetMapping("/getproduct")
	public ArrayList<ProductDto> getProduct() {
		return productService.getAllProducts();
	}

	// update putMapping
	// ProductDtodelete deleteMapping

}
