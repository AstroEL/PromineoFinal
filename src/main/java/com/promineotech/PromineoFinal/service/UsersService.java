package com.promineotech.PromineoFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.PromineoFinal.entity.User;
import com.promineotech.PromineoFinal.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	UsersRepository repo;

	public User getUser(Long id) {
		return repo.findOne(id);
	}

	public Iterable<User> getUsers() {
		return repo.findAll();
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
			foundUser.setUserName(user.getUserName());
			repo.save(foundUser);
		}
		return foundUser;
	}

	public User addUser(User user) {
		return repo.save(user);
	}

	public User login(User user) {
		List<User> foundUsers = repo.findUsersByUserNameAndPassword(user.getUserName(), user.getPassword());
		if (foundUsers.isEmpty()) {
			return null;
		}
		return foundUsers.get(0);
	}

	
	
}
