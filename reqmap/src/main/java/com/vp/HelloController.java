package com.vp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/")
    public ModelAndView hello(){ 
		return new ModelAndView("home", "msg","Hello Spring");
}
}