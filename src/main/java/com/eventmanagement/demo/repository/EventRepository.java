package com.eventmanagement.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.eventmanagement.demo.model.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
	
	// List<Event> findByName(@Param("name") String name);
	
	Page<Event> findByName(@Param("name") String name, Pageable pageable);

}
