package com.pms.repository;

import org.springframework.data.repository.CrudRepository;

import com.pms.modal.User;

public interface UserRepository extends CrudRepository<User, Integer> {	
	
	public User findByUsernameAndPassword(String username, String password);
}
