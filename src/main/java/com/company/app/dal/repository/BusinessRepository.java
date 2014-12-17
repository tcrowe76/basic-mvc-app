package com.company.app.dal.repository;

import java.util.List;

import com.company.app.domain.BusinessObject;

public interface BusinessRepository {

	public List<BusinessObject> getData();
	
	public void putData(BusinessObject newData);
}
