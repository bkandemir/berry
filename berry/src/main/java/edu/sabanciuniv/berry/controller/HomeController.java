package edu.sabanciuniv.berry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {		
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/guest")
	public String guest() {
		return "guest";
	}

}
