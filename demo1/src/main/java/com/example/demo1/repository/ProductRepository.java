package com.example.demo1.repository;

import org.springframework.stereotype.Repository;

import com.example.demo1.modal.Product;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	ProductRepository findByName(String name);

//    @Query("SELECT f FROM Foo f WHERE LOWER(f.name) = LOWER(:name)")
//    ProductRepository retrieveByName(@Param("name") String name);
}