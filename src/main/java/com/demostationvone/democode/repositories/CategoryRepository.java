package com.demostationvone.democode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demostationvone.democode.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
