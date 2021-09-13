package com.eventmanagement.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.eventmanagement.demo.model.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
