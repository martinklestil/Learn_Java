package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;



public class TimeEntry {
	
	private Long id;
	
	private final LocalDateTime start;
	
	private LocalDate stop;
	
	private String description;
	
	//Ich habe hier auf Lombok verzichtet.

	public TimeEntry(LocalDateTime start) {
		super();
		this.start = start;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getStop() {
		return stop;
	}

	public void setStop(LocalDate stop) {
		this.stop = stop;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getStart() {
		return start;
	}
	
	
}
