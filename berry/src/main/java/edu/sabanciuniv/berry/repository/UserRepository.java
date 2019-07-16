package edu.sabanciuniv.berry.repository;

import org.springframework.data.repository.CrudRepository;

import edu.sabanciuniv.berry.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String userName);
	
}

