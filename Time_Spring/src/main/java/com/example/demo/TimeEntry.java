package com.example.demo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//Repository
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor

public class TimeEntry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NonNull
	private LocalDateTime start;
	
	private LocalDateTime stop;
	
	private String description;
	
	
	
}
