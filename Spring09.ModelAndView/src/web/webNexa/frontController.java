package web.webNexa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import web.webNexa.Data.User;

@Controller
public class frontController {
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelView= new ModelAndView("userViewForm");
		User user = new User();
		modelView.addObject("user",user);
		return modelView;
	}
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelAndView= new ModelAndView("displayUserInfo");
		System.out.println(user);
		modelAndView.addObject("user", user);
		return modelAndView;
		
	}


	}




