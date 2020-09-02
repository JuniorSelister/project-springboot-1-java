package com.demostationvone.democode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demostationvone.democode.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
