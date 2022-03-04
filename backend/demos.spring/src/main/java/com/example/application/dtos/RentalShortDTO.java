package com.example.application.dtos;


import java.util.Date;


import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import lombok.Value;


	@Value
	@ApiModel(value = "Alquiler simple", description = "Version reducida de los Alquileres.")
	public class RentalShortDTO {
		@JsonProperty("id")
		private int rentalId;
		@JsonProperty("fecha")
		@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
		private Date rentalDate;

		public static RentalShortDTO from(Rental source) {
			return new RentalShortDTO(
					source.getRentalId(),
					source.getRentalDate()
					);
		}

}
