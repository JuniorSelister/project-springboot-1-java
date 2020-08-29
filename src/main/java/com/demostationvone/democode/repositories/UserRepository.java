package com.demostationvone.democode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demostationvone.democode.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
