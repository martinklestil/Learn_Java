package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping("/index")
	ModelAndView index() {
		
		// Business Logik
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("title", "Zeiteinträge Anwendung");
		
		return modelAndView;
	}

}
