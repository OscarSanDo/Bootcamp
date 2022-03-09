package com.example.application.dtos;


import java.util.Date;
import java.util.List;




import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
@ApiModel(value = "Alquiler extendida", description = "Version extendida de los Alquileres.")
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
	@ApiModelProperty(value = "Nombre del cliente.")
	private String customer;
	@JsonProperty("inventario")
	@ApiModelProperty(value = "Identificador del inventario")
	private int inventory;
	@JsonProperty("empleado")
	@ApiModelProperty(value = "Identificador del empleado")
	private String staff;
	@ApiModelProperty(value = "Lista de los pagos realizados.")
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