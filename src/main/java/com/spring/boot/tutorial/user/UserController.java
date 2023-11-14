package com.spring.boot.tutorial.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userservice.getAllUser();
	}

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable String id) {
		return userservice.getUser(id);
	}
}
