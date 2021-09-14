package com.eventmanagement.demo.model;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Venue extends AbstractEntity {

	private String name;
	private String streetAddress;
	private String streetAddress2;
	private String city;
	private String state;
	private String country;
	private String postalCode;
	
	public Long getResourceId() {
		return this.id;
	}

}
