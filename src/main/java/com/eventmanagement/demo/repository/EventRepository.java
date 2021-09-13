package com.eventmanagement.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.eventmanagement.demo.model.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
