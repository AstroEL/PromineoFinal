package com.promineotech.PromineoFinal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.PromineoFinal.entity.User;

public interface UsersRepository extends CrudRepository<User, Long>{

	public List<User> findUsersByUsernameAndPassword(String username, String password);
	
}
