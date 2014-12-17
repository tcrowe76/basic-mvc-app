package com.company.app.domain;

import org.springframework.stereotype.Component;

@Component
public class BusinessObject {

	String id;

	public BusinessObject() {
		
	}

	public BusinessObject(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
