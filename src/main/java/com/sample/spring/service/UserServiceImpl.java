package com.sample.spring.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.spring.dao.UserRepository;
import com.sample.spring.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	private static Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean isValidUser(User user) {
		logger.info("isValidUser is called with user "+ user);
		User getUser = userRepository.getUser(user);
		if(getUser != null){
			return true;
		}
		return false;
	}

}
