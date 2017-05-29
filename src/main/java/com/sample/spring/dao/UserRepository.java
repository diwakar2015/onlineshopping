package com.sample.spring.dao;

import org.springframework.stereotype.Repository;

import com.sample.spring.model.User;

@Repository
public class UserRepository {

	private static final String USER_NAME = "peter";
	private static final String PASSWORD = "pass";

	public User getUser(User user) {
		// dummy call to db
		if (user.getUserName().equalsIgnoreCase(USER_NAME) && user.getPassword().equalsIgnoreCase(PASSWORD)) {
			return user;
		} else {
			return null;
		}
	}

}
