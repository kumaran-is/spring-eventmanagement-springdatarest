package com.eventmanagement.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.eventmanagement.demo.model.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
