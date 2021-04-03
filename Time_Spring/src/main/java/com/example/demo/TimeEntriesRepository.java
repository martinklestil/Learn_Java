package com.example.demo;

import org.springframework.data.repository.CrudRepository;

//Datenbank
public interface TimeEntriesRepository extends CrudRepository<TimeEntry, Long> {

}
