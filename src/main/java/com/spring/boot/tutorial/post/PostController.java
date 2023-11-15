package com.spring.boot.tutorial.post;

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
public class PostController {

	@Autowired
	private PostService postservice; 
	
	@GetMapping("/posts")
	public List<Post> getAllPost(){
		return postservice.getAllLocation();
	}
	
	@GetMapping("/posts/{id}")
	public Optional<Post> getPost(@PathVariable String id){
		return postservice.getPost(id);
	}
	
	@PostMapping("/posts")
	public void addPost(@RequestBody Post post) {
		postservice.addPost(post);
	}
	
	@PutMapping("/posts/{id}")
	public void updatePost(@PathVariable String id, @RequestBody Post post) {
		postservice.updatePost(id, post);
	}
	
	@DeleteMapping("/posts/{id}")
	public void deletePost(String id) {
		postservice.deletePost(id);
	}
	/*
	 * @GetMapping("/posts") public List<Post> getAllPosts(){ return
	 * postservice.getAllPosts(); }
	 * 
	 * @GetMapping("/posts/{id}") public Post gePost(@PathVariable String id){
	 * return postservice.getPost(id); }
	 * 
	 * @PostMapping("/posts") public void addPost(@RequestBody Post post) {
	 * postservice.addPost(post); }
	 * 
	 * @PutMapping("/posts/{id}") public void updatePost(@PathVariable String
	 * id, @RequestBody Post post) { postservice.updatePost(id, post); }
	 * 
	 * @DeleteMapping("/posts/{id}") public void deletePost(@PathVariable String id)
	 * { postservice.deletePost(id);
	 * 
	 * }
	 */
}
