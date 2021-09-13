package com.eventmanagement.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eventmanagement.demo.controller.exceptioins.NotCheckedInException;
import com.eventmanagement.demo.model.Participant;
import com.eventmanagement.demo.repository.ParticipantRepository;

@RepositoryRestController
@RequestMapping("/events")
public class CheckOutController {

	@Autowired
	private ParticipantRepository participantRepository;

	@PostMapping("/checkout/{id}")
	public ResponseEntity<PersistentEntityResource> checkout(@PathVariable Long id,PersistentEntityResourceAssembler assembler) {

		Participant participant = participantRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Participant with id " + id + " does not exists"));


			if (!participant.getCheckedIn()) {
				throw new NotCheckedInException("Participant with id " + id + " not Checked-In");
			}
			participant.setCheckedIn(false);
			participantRepository.save(participant);
		
		return ResponseEntity.ok(assembler.toFullResource(participant));

	}
}
