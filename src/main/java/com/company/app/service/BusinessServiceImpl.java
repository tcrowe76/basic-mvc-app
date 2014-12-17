package com.company.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.dal.repository.BusinessRepository;
import com.company.app.domain.BusinessObject;

@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private BusinessRepository businessRepository;

	public List<BusinessObject> getBusinessObjects() {

		//implement logic for getting objects
		return businessRepository.getData();
	}
	
	public void addBusinessObject(String id) {

		//implement logics for adding objects
		businessRepository.putData(new BusinessObject(id));
	}
	

}
