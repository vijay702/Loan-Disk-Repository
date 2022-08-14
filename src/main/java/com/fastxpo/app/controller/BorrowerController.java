package com.fastxpo.app.controller;

import com.fastxpo.app.model.Borrower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fastxpo.app.model.CountryDto;
import com.fastxpo.app.service.BorrowerService;

import java.util.List;

@RestController
@RequestMapping("/v1/fastxpo")
@CrossOrigin
public class BorrowerController {
	
	@Autowired
	private BorrowerService borrowerService;

	@GetMapping("country/{countryname}")
	public List<CountryDto> getAllCountries(@PathVariable ("countryname") String countryName) {
		return borrowerService.getAllCountries(countryName);
		
	}

	@PostMapping("/add-borrower")
	public ResponseEntity<Borrower> addBorrower(@RequestBody Borrower borrower){

		borrowerService.addBorrower(borrower);
		return new ResponseEntity<>(HttpStatus.CREATED);

	}

	

}
