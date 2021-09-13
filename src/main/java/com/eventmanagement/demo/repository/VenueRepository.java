package com.eventmanagement.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.eventmanagement.demo.model.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
