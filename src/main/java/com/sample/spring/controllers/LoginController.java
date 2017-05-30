package com.sample.spring.controllers;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	public ModelAndView login(@Valid @ModelAttribute("userInfo") User userInfo, BindingResult result) {

		logger.info("Request received from web for login for user : " + userInfo);
		
		if (result.hasErrors()) {
			return new ModelAndView("login");
		}
		
		ModelAndView mv = null;

		boolean isValidUser = userService.isValidUser(userInfo);
		if (isValidUser) {
			mv = new ModelAndView("home");
			mv.addObject("userinfo",userInfo);
		} else {
			mv = new ModelAndView("login");
			mv.addObject("status", "falied");
		}
		logger.info("Sending response for login for user : " + userInfo);
		return mv;

	}

}
