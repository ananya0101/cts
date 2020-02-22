package com.vp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vp.dao.UserDao;
import com.vp.model.User;

@RestController
public class HomeController {
	
	@Autowired
	UserDao dao;
   
	@RequestMapping("/homedata")
	public ResponseEntity<?> getHomeData() {
		
		return new ResponseEntity<User>(new User(11,"Giri", "Add1111"), HttpStatus.OK);
			
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getUsers(){
				
		return dao.getUsers();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUser(@PathVariable("id") int id) {
		return dao.getUser(id);
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		return dao.insertUser(user);
	}
	
	@DeleteMapping("user/{id}")
	public int deleteUser(@PathVariable("id") int id) {
		return dao.deleteUser(id);
	}
}
