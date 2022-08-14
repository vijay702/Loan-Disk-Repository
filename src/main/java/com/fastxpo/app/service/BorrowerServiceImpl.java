package com.fastxpo.app.service;

import com.fastxpo.app.entity.BorrowerEntity;
import com.fastxpo.app.entity.Country;
import com.fastxpo.app.model.Borrower;
import com.fastxpo.app.model.CountryDto;
import com.fastxpo.app.repository.BorrowerRepository;
import com.fastxpo.app.repository.CountryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerServiceImpl implements BorrowerService {
	
	
	@Autowired
	private BorrowerRepository  borrowerRepository;

	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<CountryDto> getAllCountries(String countryName) {
		Country countries = countryRepository.findBycountryName(countryName);
		List<CountryDto> countryDto = List.of(mapToDto1(countries));
		return  countryDto;
	}

	@Override
	public Borrower addBorrower(Borrower borrower) {
		BorrowerEntity borrowerEntity = mapToEntity(borrower);
		BorrowerEntity addBorrower = borrowerRepository.save(borrowerEntity);
		return mapToDto(addBorrower);
	}


	private BorrowerEntity mapToEntity(Borrower borrower) {
		
		BorrowerEntity borrowerEntity = mapper.map(borrower,BorrowerEntity.class);
		return  borrowerEntity;
	}

	private Borrower mapToDto (BorrowerEntity borrowerEntity){

		Borrower borrower = mapper.map(borrowerEntity,Borrower.class);
		return borrower;
	}


	private CountryDto mapToDto1 (Country country){

		CountryDto countryDto = mapper.map(country,CountryDto.class);
		return countryDto;
	}

	

}
