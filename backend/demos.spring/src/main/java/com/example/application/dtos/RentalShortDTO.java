package com.example.application.dtos;


import java.util.Date;


import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Value;


	@Value
	public class RentalShortDTO {
		@JsonProperty("id")
		private int rentalId;
		@JsonProperty("fecha")
		private Date rentalDate;

		public static RentalShortDTO from(Rental source) {
			return new RentalShortDTO(
					source.getRentalId(),
					source.getRentalDate()
					);
		}

}
