package com.example.application.dtos;

import com.example.domains.entities.Country;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CountryDTO {
	@JsonProperty("id")
	private int countryId;
	@JsonProperty("pais")
	private String country;
	
	public static Country from(CountryDTO source) {
		return new Country(source.getCountryId(), source.getCountry());
	}
	
	public static CountryDTO from(Country source) {
		return new CountryDTO(source.getCountryId(), source.getCountry());
	}

}
