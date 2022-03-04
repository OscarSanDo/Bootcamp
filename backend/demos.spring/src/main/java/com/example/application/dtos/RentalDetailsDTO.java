package com.example.application.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;


import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class RentalDetailsDTO {
	@JsonProperty("id")
	private int rentalId;
	@JsonProperty("pelicula")
	private String filmName;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date rentalDate;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date returnDate;
	@JsonProperty("cliente")
	private String customer;
	@JsonProperty("inventario")
	private int inventory;
	@JsonProperty("empleado")
	private String staff;
	private List<Integer> payments;
	

	public static RentalDetailsDTO from(Rental source) {
		return new RentalDetailsDTO(
				source.getRentalId(), 
				source.getInventory().getFilm().getTitle(), 
				source.getRentalDate(),
				source.getReturnDate() == null ? null : source.getReturnDate(), 
				source.getCustomer().getFirstName() + " " + source.getCustomer().getLastName(),
				source.getInventory().getInventoryId(),
				source.getStaff().getFirstName() + " " + source.getStaff().getLastName(),
				null
				); 
				
	}
}