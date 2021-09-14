package com.eventmanagement.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Participant extends AbstractEntity {

	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String email;
	private Boolean checkedIn;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "ID", nullable = false, updatable = false)
	private Event event;
	
	public Long getResourceId() {
		return this.id;
	}

}
