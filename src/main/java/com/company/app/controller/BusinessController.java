package com.company.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.app.domain.BusinessObject;
import com.company.app.service.BusinessService;

@Controller
public class BusinessController {

	@Autowired
	BusinessService businessService;
	
	@RequestMapping(value = "/business", method = RequestMethod.GET)
	public String business(Model model) {
		
		BusinessObject business = new BusinessObject("123");
		
		model.addAttribute("businessMessage", "Business doing business");
		model.addAttribute("business", business);
		return "business";
	}
	
	@RequestMapping(value = "/business/addProduct", method = RequestMethod.GET) 
	public String addProduct(Model model) {
	
		businessService.addBusinessObject("456");
		
		model.addAttribute("businessObjects", businessService.getBusinessObjects());
		
		return "businessComplete";
	}
	
	
}
