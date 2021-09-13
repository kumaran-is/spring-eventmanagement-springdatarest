package com.eventmanagement.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.eventmanagement.demo.model.Organizer;

public interface OrganizerRepository extends CrudRepository<Organizer, Long> {

}
