package com.example.application.dtos;

import com.example.domains.entities.City;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class CityDetailsDTO {
	@JsonProperty("id")
	private int cityId;
	@JsonProperty("ciudad")
	private String city;
	@JsonProperty("pais")
	private String country;

	public static CityDetailsDTO from(City source) {
		return new CityDetailsDTO(
				source.getCityId(), 
				source.getCity(),
				source.getCountry().getCountry());
	}
}