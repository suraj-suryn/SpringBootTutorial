package com.spring.boot.tutorial.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return userservice.getAllUser();
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable String id){
		return userservice.getUser(id);
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userservice.addUser(user);
	}
	
	@PutMapping("/users/{id}")
	public void updateUser(@PathVariable String id, @RequestBody User user) {
		userservice.updateUser(id, user);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable String id) {
		userservice.deleteUser(id);
	}
	/*
	 * 
	 * @GetMapping("/users") public List<User> getAllUsers(){ return
	 * userservice.getAllUser(); }
	 * 
	 * @GetMapping("/users/{id}") public User getUser(@PathVariable String id) {
	 * return userservice.getUser(id); }
	 * 
	 * @PostMapping("/users") public void addUser(@RequestBody User user) {
	 * userservice.addUser(user); }
	 * 
	 * @PutMapping("/users/{id}") public void updateUser(@RequestBody User
	 * user,@PathVariable String id) { userservice.updateUser(id,user); }
	 * 
	 * @DeleteMapping("/users/{id}") public void deleteUser(@PathVariable String id)
	 * { userservice.deleteUser(id); }
	 */
}
