package com.demostationvone.democode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demostationvone.democode.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
