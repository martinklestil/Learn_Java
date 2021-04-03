package com.example.demo;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TimeEntriesController {
	
	public List<TimeEntry> timeEntries = new LinkedList<>();
	
	public TimeEntriesController() {
		timeEntries.add(new TimeEntry(LocalDateTime.now()));
		timeEntries.add(new TimeEntry(LocalDateTime.now()));
		timeEntries.add(new TimeEntry(LocalDateTime.now()));
		timeEntries.add(new TimeEntry(LocalDateTime.now()));
		timeEntries.add(new TimeEntry(LocalDateTime.now()));
	}
	
	@GetMapping("/timeEntries")
	public ModelAndView index() {
		
		// Business Logik
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("title", "Zeiteinträge Anwendung");
		modelAndView.addObject("timeEntries", timeEntries);
		
		return modelAndView;
	}

}
