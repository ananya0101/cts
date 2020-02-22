package com.ananya.jdbctemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ananya.jdbctemp.model.Employee;
import com.ananya.jdbctemp.service.EmpService;

@Controller
public class HomeController {
	
	@Autowired
	EmpService employeeService;
	
   @RequestMapping("/home")
   String home() {
	   return "home";
   }
   
   @RequestMapping("/listEmployee")
   String getEmployee(Model model) {
	   List<Employee> list = employeeService.getAllEmployee();
	   System.out.println(list);
	   model.addAttribute("liststud", list);
	   return "listStudents";
   }
   
}
