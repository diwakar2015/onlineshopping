package com.sample.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.spring.model.User;
import com.sample.spring.service.UserService;

@Controller
public class LoginController {

	private static Logger logger = Logger.getLogger(LoginController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("userLoginForm") User user) {

		logger.info("Request received from web for login for user : " + user);
		ModelAndView mv = null;

		boolean isValidUser = userService.isValidUser(user);
		if (isValidUser) {
			mv = new ModelAndView("home");
			List<User> userList= new ArrayList<>();
			mv.addObject("userinfo", userList);
		} else {
			mv = new ModelAndView("index");
			mv.addObject("status", "falied");
		}
		logger.info("Sending response for login for user : " + user);
		return mv;

	}

}
