package com.eventmanagement.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.eventmanagement.demo.model.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {
	
	Page<Venue> findByPostalCode(@Param("postalCode") String postalcode, Pageable pageable);

}
