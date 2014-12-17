package com.company.app.dal;

import com.company.app.dal.mapper.BusinessObjectMapper;

public class BusinessObjectDao {

	static boolean isInitialized;
	
	BusinessObjectMapper mapper;
	
	private static void init() {
	
		if (!isInitialized) {
			//create new SQLSessionFactory here
		}
	}
	
}
