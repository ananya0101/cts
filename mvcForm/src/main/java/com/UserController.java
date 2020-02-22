package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping(value="/registerForm", method=RequestMethod.GET)
	public String regUser() {
		
		return "regiForm";
	}
	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public ModelAndView regiUser(@RequestParam("username") String uname,
								 @RequestParam("age") int age,
								 @RequestParam("emil") String emil){
		User user = new User(uname, age, emil);
		return new ModelAndView("regSuccess", "user", user);
	}
}
