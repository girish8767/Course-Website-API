package com.example.Course.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class course {
	
	@Id
	public long id;
	public String title;
	public String description;
	
	public course() {
	}
	
	public course(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
