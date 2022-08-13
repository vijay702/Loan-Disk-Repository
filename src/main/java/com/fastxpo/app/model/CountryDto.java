package com.fastxpo.app.model;

import java.util.List;

public class CountryDto {
	
	private List<String> country;

	public List<String> getCountry() {
		return country;
	}

	public void setCountry(List<String> country) {
		this.country = country;
	}

	public CountryDto(List<String> country) {
		super();
		this.country = country;
	}

	public CountryDto() {
	
	}

	@Override
	public String toString() {
		return "CountryDto [country=" + country + "]";
	}
	
	

}
