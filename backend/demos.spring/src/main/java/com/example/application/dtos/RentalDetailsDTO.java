package com.example.application.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.example.domains.entities.Film;
import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class RentalDetailsDTO {
	@JsonProperty("id")
	private int rentalId;
	@JsonProperty("pelicula")
	private String filmName;
	@JsonProperty("fechaAlquilado")
	private Date rentalDate;
	@JsonProperty("fechaDevuelto")
	private Date returnDate;
	@JsonProperty("cliente")
	private String customer;
	@JsonProperty("inventario")
	private int inventory;
	@JsonProperty("staff")
	private String staff;

	public static RentalDetailsDTO from(Rental source) {
		return new RentalDetailsDTO(
				source.getRentalId(), 
				source.getInventory().getFilm().getTitle(), 
				source.getRentalDate(),
				source.getReturnDate(), 
				source.getCustomer().getFirstName() + " " + source.getCustomer().getLastName(),
				source.getInventory().getInventoryId(),
				source.getStaff().getFirstName() + " " + source.getStaff().getLastName()); 
				
	}
}