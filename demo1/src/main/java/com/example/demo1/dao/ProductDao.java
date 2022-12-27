package com.example.demo1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo1.dto.ProductDto;
//@Component
public class ProductDao {
	//@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public void createProduct(ProductDto productDto) {
		System.out.println("productDto  -->" + productDto.getName());
		String sql ="Insert into product  (Id ,Name) values (? ,?)";
		int r= jdbcTemplate.update(sql, new Object[] {productDto.getName(),productDto.getPrice()});
		System.out.println("updated record count "+r);
	}

}
