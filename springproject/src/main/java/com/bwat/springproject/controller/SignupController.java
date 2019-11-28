package com.bwat.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bwat.springproject.model.User;

@Controller
public class SignupController {
	
	@RequestMapping(value="/userSignup",method=RequestMethod.GET)
   public String getSignUpForm() {
	   
		return "signup";
   }
     @RequestMapping(value="/userSignup",method=RequestMethod.POST)
	public String signup(@ModelAttribute User u, Model model) {
		
    	 return "login";	
	}
     
}
