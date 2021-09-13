package com.eventmanagement.demo.model.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.eventmanagement.demo.model.Venue;

@Projection(name = "virtual", types = { Venue.class })
public interface StreetAddressProjection {

	@Value("#{target.streetAddress} #{target.streetAddress2}")
	String getCompleteStreetAddress();
}
