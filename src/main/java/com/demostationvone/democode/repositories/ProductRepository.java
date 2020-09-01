package com.demostationvone.democode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demostationvone.democode.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
