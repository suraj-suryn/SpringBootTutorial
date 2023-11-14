package com.spring.boot.tutorial.post;

import com.spring.boot.tutorial.user.User;

public class Post {
	
	private String id;
	private String postingdate;
	private User user;
	private String details;
	
	
	public Post(String id, String postingdate, User user, String details) {
		super();
		this.id = id;
		this.postingdate = postingdate;
		this.user = user;
		this.details = details;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPostingdate() {
		return postingdate;
	}
	public void setPostingdate(String postingdate) {
		this.postingdate = postingdate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", postingdate=" + postingdate + ", user=" + user + ", details=" + details + "]";
	}
	
	
}
