package com.spring.boot.tutorial.post;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.tutorial.location.Location;
import com.spring.boot.tutorial.user.User;

@Service
public class PostService {
	User user1 = new User("U1","Sam","S","sam@gmail.com",new Location("L1","Mumbai"));
	User user2 = new User("U2","Jack","P","jack@gmail.com",new Location("L2","Delhi"));
	User user3 = new User("U3","Roy","K","roy@gmail.com",new Location("L3","Ranchi"));
	User user4 = new User("U4","Mack","T","mack@gmail.com",new Location("L4","Kashi"));
	
	Post post1 = new Post("P1","12-Nov-2021",user1,"My First Post.");
	Post post2 = new Post("P2","12-Nov-2022",user2,"My Second Post.");
	Post post3 = new Post("P3","12-Nov-2023",user3,"My Third Post.");
	Post post4 = new Post("P4","12-Nov-2024",user4,"My Fourth Post.");
	
	List<Post> posts = Arrays.asList(post1,post2,post3,post4);
	
	public List<Post> getAllPosts(){
		return posts;
	}
	
	public Post getPost(String id) {
		Post post = posts.stream().filter(p->id.equalsIgnoreCase(p.getId())).findFirst().orElse(null);
		return post;
	}
}
