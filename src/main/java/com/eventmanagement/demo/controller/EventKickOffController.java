package com.eventmanagement.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eventmanagement.demo.controller.exceptioins.EventAlreadyStartedException;
import com.eventmanagement.demo.model.Event;
import com.eventmanagement.demo.repository.EventRepository;

@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {

	@Autowired
	private EventRepository eventRepository;

	@PostMapping("/start/{id}")
	public ResponseEntity<String> start(@PathVariable Long id) {
		Event event = eventRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Event with id " + id + " does not exists"));
	
		if (event.getStarted()) {
			throw new EventAlreadyStartedException("Event with id " + id + " already Started");
		}
		event.setStarted(true);
		eventRepository.save(event);

		return ResponseEntity.ok(event.getName() + " has started");
	}

}
