package edu.sabanciuniv.berry.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.sabanciuniv.berry.domain.Authority;
import edu.sabanciuniv.berry.domain.User;
import edu.sabanciuniv.berry.repository.AuthorityRepository;
import edu.sabanciuniv.berry.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;

	@Autowired
	private AuthorityRepository authorityRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		// This returns a JSON or XML with the users
		model.addAttribute("userList", userRepository.findAll());
		return "welcome";
	}

	// Login form
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login() {
		if (SecurityContextHolder.getContext().getAuthentication() != null
				&& SecurityContextHolder.getContext().getAuthentication().isAuthenticated()
				&& !(SecurityContextHolder.getContext().getAuthentication() instanceof AnonymousAuthenticationToken)) {
				// user has already logged in
			return "redirect:/";
		} else {		
			return "login";
		}
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@Valid User user, BindingResult result, HttpServletRequest request,Model model) {
		if (result.hasErrors()) 
		{
			return "login";
		
		} else {
			Optional<User> check = userRepository.findById(user.getUsername());
			if(check.isPresent()==true) 
			{
				if (check.get().getUsername().equals(user.getUsername()) && check.get().getPassword().equals(user.getPassword()))
				{
					return "redirect:/index";
				}
				else
				{
					model.addAttribute("logError","logError");
					return "login";
				} 
			}
			else 
			{ 
				model.addAttribute("logError","logError");
				return "login";
			}
		}	
	}

	
	// Login form
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(ModelMap model) {
		if (SecurityContextHolder.getContext().getAuthentication() != null
				&& SecurityContextHolder.getContext().getAuthentication().isAuthenticated()
				&& !(SecurityContextHolder.getContext().getAuthentication() instanceof AnonymousAuthenticationToken)) {
			// user has already logged in
			return "redirect:/";
		} else {
			// to make available for binding, we need default user
			model.addAttribute("user", new User());
			return "register";
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Valid User user, BindingResult result, HttpServletRequest request) {

		if (result.hasErrors()) {
			return "register";
		} else {
			Optional<User> check = userRepository.findById(user.getUsername());
			if (check.isPresent() == false) {
				userRepository.save(user);

				Authority auth = new Authority();
				auth.setUsername(user.getUsername());
				auth.setRole("ROLE_USER");
				authorityRepository.save(auth);
				return "login";
			} else { // it means that this username exists
				return "redirect:/register?error";
			}
		}	
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/addnote")
	public String addnote() {
		return "addnote";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@RequestMapping("/guest")
	public String guest() {
		return "guest";
	}
	
	@RequestMapping("/settings")
	public String settings() {
		return "settings";
	}

}
