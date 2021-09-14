package com.eventmanagement.demo.repository;

import java.time.ZoneId;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import com.eventmanagement.demo.model.Event;
import com.eventmanagement.demo.model.projections.PartialEventProjection;

@RepositoryRestResource(excerptProjection=PartialEventProjection.class)
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
	
	// List<Event> findByName(@Param("name") String name);
	
	Page<Event> findByName(@Param("name") String name, Pageable pageable);
	
	Page<Event> findByNameAndZoneId(@Param("name") String name, @Param("zoneId") ZoneId zoneId, Pageable pageable);
	
	
	// Adding method level security
	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	void deleteById(Long id);

}
