package p1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
   @RequestMapping("hello")
   ModelAndView hello(){	   
	   return new ModelAndView("hello", "msg", "Hello Spring MVC ..");
   }
   @RequestMapping("hellol")
   public ModelAndView home(){ 
		return new ModelAndView("home", "msg","Hello Spring");
   }
   @RequestMapping("/hello1")
   public ModelAndView hello1() {
   	System.out.println("Reached here");
   	return new ModelAndView("add", "msg", "Hello message ...");
   }
	
	@RequestMapping("/hello/add")
	public String hello2() {
		return "add";
	}

	@RequestMapping(value="/rqparam", method=RequestMethod.GET)
	public String rqParam1(Model model,
						   @RequestParam String username,
						   @RequestParam("password") String pw) {
		model.addAttribute("uname", username);
		model.addAttribute("pw", pw);
		return "rq_param";
	}
	
	@RequestMapping(value="/path_variable/{empname}/{empage}")
	public String rqPathVariable(Model model, 
								 @PathVariable String empname, 
								 @PathVariable int empage) {
		model.addAttribute("empname", empname);
		model.addAttribute("empage", empage);
		return "path_variable";
	}
	@RequestMapping(value="/page1", method=RequestMethod.GET)
	public String page1(Model model) {
		model.addAttribute("pag1msg", "The model is automaticly populated at request ...");
		return "page";
	}
	@RequestMapping(value="/page3", method=RequestMethod.GET)
	public void page2(Model model) {
		model.addAttribute("modelMsg", "The view automaticly loaded...(page3.jsp)");
	}
	@RequestMapping(value="respbody", method= RequestMethod.GET)
	@ResponseBody
	public String respBodyMethod1() {
		return "ResponseBody example";
	}
	
	
}