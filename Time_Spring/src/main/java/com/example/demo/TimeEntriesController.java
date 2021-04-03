package com.example.demo;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TimeEntriesController {
	
	@Autowired
	public TimeEntriesRepository repository;
	
	
	@GetMapping("/add_timeentry")
	public ModelAndView addTimeentry() {
		// Datenbank
		TimeEntry timeEntry = new TimeEntry(LocalDateTime.now());
		repository.save(timeEntry);
		return timeentries();
	}
	
	@GetMapping("/timeEntries")
	public ModelAndView timeentries() {
	
		// Business Logik
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("title", "Zeiteinträge Anwendung");
		modelAndView.addObject("timeEntries", repository.findAll());
		
		return modelAndView;
	}

}
