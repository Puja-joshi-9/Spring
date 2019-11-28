package com.bwat.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bwat.springproject.model.User;

@Controller
public class LoginController {
	
	@RequestMapping(value="/userlogin",method = RequestMethod.GET)
	public String getLoginForm() {
		
		return "login";
	}
	
	@RequestMapping(value="/userlogin",method=RequestMethod.POST)
	public String login(@ModelAttribute User u, Model model) {
		
		if(u.getUsername().equals("Ram" )&& u.getPassword().equals("123")) {
			
			model.addAttribute("user", u.getUsername());
			
			return "home";
		}
		
		model.addAttribute("error", "user doesnot exist!!");
		return "login";
		
		
	}

}
