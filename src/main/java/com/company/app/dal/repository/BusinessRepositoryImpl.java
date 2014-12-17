package com.company.app.dal.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.company.app.domain.BusinessObject;

@Repository
public class BusinessRepositoryImpl implements BusinessRepository {

	private List<BusinessObject> listOfBusinessObjects = new ArrayList<BusinessObject>();

	//initialize repo with static data
	public BusinessRepositoryImpl() {
	
		listOfBusinessObjects.add(new BusinessObject("135"));
		listOfBusinessObjects.add(new BusinessObject("123"));
		
	}
	
	public List<BusinessObject> getData() {
		
		return listOfBusinessObjects;
		
	}
	
	public void putData(BusinessObject newData) {
		
		listOfBusinessObjects.add(newData);
	}
}
