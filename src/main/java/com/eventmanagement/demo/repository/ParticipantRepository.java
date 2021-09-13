package com.eventmanagement.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.eventmanagement.demo.model.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
