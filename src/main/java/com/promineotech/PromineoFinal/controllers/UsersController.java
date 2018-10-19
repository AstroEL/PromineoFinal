package com.promineotech.PromineoFinal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.PromineoFinal.entity.Quiz;
import com.promineotech.PromineoFinal.entity.User;
import com.promineotech.PromineoFinal.service.QuizService;
import com.promineotech.PromineoFinal.service.UsersService;

@RestController
public class UsersController {

	@Autowired
	UsersService service;
	
	@Autowired
	QuizService quizService;

	// Retrieve all users
	@RequestMapping("/users")
	public Iterable<User> getUsers() {
		return service.getUsers();
	}

	// Retrieve user by a specific user id
	@RequestMapping(value = "/users/{id}")
	public User getUserById(@PathVariable Long id) {
		return service.getUserById(id);
	}

	// Update a specific user by user id
	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user, @PathVariable Long id) {
		return service.updateUser(id, user);
	}

	// Delete a specific user by user id
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id) {
		service.deleteUser(id);
	}

	// Create a new user
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public User register(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@RequestMapping(value="/users/login", method=RequestMethod.POST)
	public User login(@RequestBody User user) {
		return service.login(user);
	}
	
	@RequestMapping("/users/{id}/quizzes")
	public Iterable<Quiz> getQuizzesByUserId(@PathVariable Long id) {
		return quizService.getQuizzesByUserId(id);
	}
	
}
