package com.promineotech.PromineoFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.PromineoFinal.entity.User;
import com.promineotech.PromineoFinal.repository.UserRepository;

@Service
public class UsersService {
	
	@Autowired
	UserRepository repo;
	
	public User getUser(Long id) {
		return repo.findOne(id);
	}
	
	public Iterable<User> getUsers() {
		return repo.findAll();
	}
	
	public Iterable<User> getUsersByClassId(Iterable<Long> class_id) {
		return repo.findAll(class_id);
	}
	
	public User getUserById(Long id) {
		return repo.findOne(id);
	}
	
	public void deleteUser(Long id) {
		repo.delete(id);
	}
	
	public User updateUser(Long id, User user) {
		User foundUser = repo.findOne(id);
		if (foundUser != null) {
			foundUser.setFirstName(user.getFirstName());		
			foundUser.setLastName(user.getLastName());
			foundUser.setClass_id(user.getClass_id());
			repo.save(foundUser);
		}
		return foundUser;
	}
	
	public User addUser(User user) {
		return repo.save(user);
	}
	
}
