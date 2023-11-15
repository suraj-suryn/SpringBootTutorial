package com.spring.boot.tutorial.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	
	public List<User> getAllUser(){
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;	
	}

	public Optional<User> getUser(String id){		
		return userRepository.findById(id);
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void updateUser(String id, User user) {
		userRepository.save(user);
	}
	
	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}
	/*
	 * User user1 = new User("U1", "Sam", "S", "sam@gmail.com", new Location("L1",
	 * "Mumbai")); User user2 = new User("U2", "Jack", "P", "jack@gmail.com", new
	 * Location("L2", "Delhi")); User user3 = new User("U3", "Roy", "K",
	 * "roy@gmail.com", new Location("L3", "Ranchi")); User user4 = new User("U4",
	 * "Mack", "T", "mack@gmail.com", new Location("L4", "Kashi"));
	 * 
	 * List<User> users = new ArrayList<>(Arrays.asList(user1, user2, user3,
	 * user4));
	 * 
	 * public List<User> getAllUser() { return users; }
	 * 
	 * public User getUser(String id) { User user = users.stream().filter(u ->
	 * id.equalsIgnoreCase(u.getId())).findFirst().orElse(null); return user; }
	 * 
	 * public void addUser(User user) { users.add(user); }
	 * 
	 * public void updateUser(String id, User user) { for (int index = 0; index <
	 * users.size(); index++) { User u = users.get(index);
	 * if(id.equalsIgnoreCase(u.getId())) users.set(index, user); return;
	 * 
	 * } }
	 * 
	 * public void deleteUser(String id) {
	 * users.removeIf(u->id.equalsIgnoreCase(u.getId()));
	 * 
	 * }
	 */
}
