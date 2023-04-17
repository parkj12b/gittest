package ksmart.gittest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KYJController {
	
	@GetMapping("/KYJ/login")
	public String getLogin(Model model) {
		model.addAttribute("title", "타이틀");
		return "/KYJ/login";
	}
	
}
