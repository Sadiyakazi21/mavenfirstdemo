package com.springstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String name ;
	private String despription;
	
	
	public Topic() {
		
	}
	public Topic(String id, String name, String despription) {
		super();
		this.id = id;
		this.name = name;
		this.despription = despription;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDespription() {
		return despription;
	}
	public void setDespription(String despription) {
		this.despription = despription;
	}
	
	
	
	

}
