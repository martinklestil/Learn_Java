package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface TimeEntriesRepository extends CrudRepository<TimeEntry, Long> {

}
