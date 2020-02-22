package p1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/listemp")
	public String listEmp(){
		return "listemp";
	}
	@RequestMapping(value="/saveemp")
	public String saveEmp(){
		return "saveemp";
	}
}