package p1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class contol1 {

	   @RequestMapping("/add")
	    public ModelAndView hello3(){    	
	    	return new ModelAndView("welcomeadd");
	    }
}