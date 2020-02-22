package com.iiht.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iiht.model.User;

@Controller
public class WelcomeController {
	
	    @RequestMapping("/regUserForm")
		public String regUserForm(Model model) {
			model.addAttribute("user", new User());
	    	
			return "regUserForm";
		}
	    
	    @RequestMapping("/registerNewUser")
		public String registerNewUser(@Valid @ModelAttribute("user") User user, BindingResult result) {		
			if (result.hasErrors()) {
	            return "regUserForm";
	        }
			
			//userService.addUser(user);
			return "success";
		}
}
