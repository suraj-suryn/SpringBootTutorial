package com.spring.boot.tutorial.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	@Autowired
	private PostService postservice; 
	
	@GetMapping("/posts")
	public List<Post> getAllPosts(){
		return postservice.getAllPosts();
	}
	
	@GetMapping("/post/{id}")
	public Post gePost(@PathVariable String id){
		return postservice.getPost(id);
	}
}
