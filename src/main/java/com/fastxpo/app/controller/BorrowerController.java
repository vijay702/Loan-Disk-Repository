package com.fastxpo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastxpo.app.model.CountryDto;
import com.fastxpo.app.service.BorrowerService;

@RestController
@RequestMapping("/v1/fastxpo")
@CrossOrigin
public class BorrowerController {
	
	@Autowired
	private BorrowerService borrowerService;
	
	
	
	
	
	public CountryDto getAllCountries() {
		
		
		
		return borrowerService.getAllCountries();
		
	}
	
	

}
