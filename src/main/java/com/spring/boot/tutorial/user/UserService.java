package com.spring.boot.tutorial.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.tutorial.location.Location;

@Service
public class UserService {

	
	User user1 = new User("U1", "Sam", "S", "sam@gmail.com", new Location("L1", "Mumbai"));
	User user2 = new User("U2", "Jack", "P", "jack@gmail.com", new Location("L2", "Delhi"));
	User user3 = new User("U3", "Roy", "K", "roy@gmail.com", new Location("L3", "Ranchi"));
	User user4 = new User("U4", "Mack", "T", "mack@gmail.com", new Location("L4", "Kashi"));

	List<User> users =  Arrays.asList(user1,user2,user3,user4);

	public List<User> getAllUser() {
		return users;
	}
	
	public User getUser(String id) {		
		User user = users.stream().filter(u->id.equalsIgnoreCase(u.getId())).findFirst().orElse(null);		
		return user;
	}
}
