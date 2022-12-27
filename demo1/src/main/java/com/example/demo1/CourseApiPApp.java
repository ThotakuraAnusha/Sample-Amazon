package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CourseApiPApp {
	
	   @Autowired
		private JdbcTemplate jdbcTemplate;
		

	public static void main(String[] args) {
		SpringApplication.run(CourseApiPApp.class, args);
		System.out.println("Application run Successfully...!!");
	}

}
