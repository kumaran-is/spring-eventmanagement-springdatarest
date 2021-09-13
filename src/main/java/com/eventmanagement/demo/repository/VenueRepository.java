package com.eventmanagement.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.eventmanagement.demo.model.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
