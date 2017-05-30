package com.sample.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.spring.model.User;

@Controller
public class IndexController {
	
	
	@RequestMapping(value= "/", method = RequestMethod.GET)
	public ModelAndView indexPage(){
		return new ModelAndView("index");
	}
	
	@RequestMapping(value= "login.html", method = RequestMethod.GET)
	public ModelAndView loginPage(){
		User user = new User();
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("userInfo", user);
		return mv;
	}
	
	@RequestMapping(value= "api.html", method = RequestMethod.GET)
	public ModelAndView apiPage(){
		User user = new User();
		ModelAndView mv = new ModelAndView("api");
		mv.addObject("userInfo", user);
		return mv;
	}
	
	@RequestMapping(value= "home.html", method = RequestMethod.GET)
	public ModelAndView home(){
		User user = new User();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("userInfo", user);
		return mv;
	}
	
	
	
	

	
	
	
	
	
	
	

}
