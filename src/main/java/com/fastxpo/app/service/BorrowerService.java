package com.fastxpo.app.service;

import com.fastxpo.app.model.Borrower;
import com.fastxpo.app.model.CountryDto;

import java.util.List;

public interface BorrowerService {

	List<CountryDto> getAllCountries(String countryName);

	Borrower addBorrower(Borrower borrower);
}
