package cts.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import cts.model.User;
import cts.service.UserService;

import org.springframework.ui.Model;

@Controller
public class UserController
{
	@Autowired
	UserService service;
	
	 @RequestMapping("/home")
	 public String home()
	 {
		 return "/home";
	 }
	 @RequestMapping("/list")
		String getUsers(Model model) {
			List<User> list = service.getAllUsers();
			model.addAttribute("list", list);
			
			return "list";
		}
	 @RequestMapping("/userForm")
	 public String saveUser(Model model) {
		 
		 model.addAttribute("user", new User());
		 return "userForm";
	 }
	 
	 @PostMapping("/saveUser")
	 public String saveUser(@ModelAttribute("user") User user) {
		 service.saveOrUpdate(user);
		 return "redirect:/list";
	 }
}