package com.jdbctemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jdbctemp.model.Student;
import com.jdbctemp.service.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	StudentService studentService;
	
   @RequestMapping("/home")
   String home() {
	   return "home";
   }
   
   @RequestMapping("/listStudents")
   String getStudents(Model model) {
	   List<Student> list = studentService.getAllStudents();
	   System.out.println(list);
	   model.addAttribute("liststud", list);
	   return "listStudent";
   }
   
   @RequestMapping("/createStudents")
   String createStudent(Model model) {
	   model.addAttribute("studt", new Student());
	   return "studentForm";
   }
   
   @RequestMapping("/saveStudent")
   String saveStudent(@ModelAttribute("studt") Student student) {
	   System.out.println(student);
	   studentService.saveStudent(student);
	   return "redirect:/listStudents";
   }
   
   @RequestMapping("/delete/{sid}")
   String deleteStudent(@PathVariable int sid) {
	   System.out.println(sid);
	   studentService.dalateStudent(sid);
	   return "redirect:/listStudents";
   }
   
   @RequestMapping("/edit/{sid}")
   String editStudent(Model model, @PathVariable int sid) {
	   
	   Student student = studentService.getStudent(sid);
	   
	   model.addAttribute("stud", student);
	   
	   
	   return "editStudentForm";
   }
   
   @RequestMapping(value = "/saveEdit", method = RequestMethod.POST)
   String saveEditStudent(@ModelAttribute("stud")Student student) {
	   System.out.println(student);
	   
	   
	   
	   studentService.editStudent(student);
	   return "redirect:/listStudents";
   }
}
