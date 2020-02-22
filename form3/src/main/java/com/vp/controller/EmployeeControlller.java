package com.vp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vp.model.Employee;
import com.vp.validator.EmployeeValidator;

@Controller
public class EmployeeControlller {
	
	@Autowired
	private EmployeeValidator employeeValidator;
	
	@InitBinder
	protected void InitBinder(WebDataBinder binder){
		binder.addValidators(employeeValidator);
	}
	
	@GetMapping("/regEmployee")
	public String empForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "empForm";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") @Validated Employee employee, 
			                   BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "empForm";
		}
		System.out.println(employee);
		model.addAttribute("employee", employee);
		return "success";
	}
}