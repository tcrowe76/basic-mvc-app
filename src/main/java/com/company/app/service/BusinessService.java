package com.company.app.service;

import java.util.List;

import com.company.app.domain.BusinessObject;

public interface BusinessService {

	public List<BusinessObject> getBusinessObjects();
	public void addBusinessObject(String id);
}
