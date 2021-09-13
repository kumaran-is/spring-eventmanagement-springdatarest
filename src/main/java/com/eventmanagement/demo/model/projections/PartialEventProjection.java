package com.eventmanagement.demo.model.projections;

import java.time.Instant;
import java.time.ZonedDateTime;

import org.springframework.data.rest.core.config.Projection;

import com.eventmanagement.demo.model.Event;


@Projection(name = "partial", types = { Event.class })
public interface PartialEventProjection {

	String getName();

	ZonedDateTime getStartTime();

	ZonedDateTime getEndTime();
	
	Instant getCreated();
}
