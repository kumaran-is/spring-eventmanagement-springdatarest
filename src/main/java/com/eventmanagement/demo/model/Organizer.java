package com.eventmanagement.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


import lombok.Data;


@Entity
@Data
public class Organizer extends AbstractEntity {

	private String name;

	@OneToMany(mappedBy = "organizer")
	private Set<Event> events;

	public Long getResourceId() {
		return this.id;
	}

}
