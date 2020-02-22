package p1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/first")
public class FirstController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String firstReq() {
		return "first";
	}
	
	@RequestMapping(value="page1_val", method = RequestMethod.GET)
	public String firstReqVal1(Model model) {
		model.addAttribute("pag1msg", "pag1msg msg");
		return "page1";
	}
	
	@RequestMapping(value="page2_val", method = RequestMethod.GET)
	public String firstReqVal2(Model model) {
		model.addAttribute("page2Msg", "pag2msg msg");
		return "page2";
	}
}