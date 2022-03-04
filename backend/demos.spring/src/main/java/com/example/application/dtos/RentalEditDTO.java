package com.example.application.dtos;


import java.util.Date;
import java.util.List;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;



import com.example.domains.entities.Customer;
import com.example.domains.entities.Inventory;
import com.example.domains.entities.Payment;
import com.example.domains.entities.Rental;
import com.example.domains.entities.Staff;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
@ApiModel(value = "Película editable", description = "Version editable de las películas.")
public class RentalEditDTO {
	
	@JsonProperty("id")
	private int rentalId;
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date rentalDate;		
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date returnDate;	
	@ApiModelProperty(value = "Nombre del cliente.")
	@PositiveOrZero
	private int customerId;	
	@ApiModelProperty(value = "")
	@PositiveOrZero
	private int inventoryId;
	@ApiModelProperty(value = "")
	@PositiveOrZero
	private int staffId;
	@ApiModelProperty(value = "Lista de identificadores de actores.")
	private List<PaymentEditDTO> payments;
	

	public static RentalEditDTO from(Rental source) {
		return new RentalEditDTO(
				source.getRentalId(), 
				source.getRentalDate(),
				source.getReturnDate() == null ? null : source.getReturnDate(), 
				source.getCustomer().getCustomerId(),
				source.getInventory().getInventoryId(),
				source.getStaff().getStaffId(),
				source.getPayments().stream().map(pago -> PaymentEditDTO.from(pago)).toList()
				); 
	}
	public static Rental from(RentalEditDTO source) {
		return new Rental (
				source.getRentalId(), 
				source.getRentalDate(),
				source.getReturnDate(),
				new Inventory (source.getInventoryId()), 
				new Customer (source.getCustomerId()),
				new Staff (source.getStaffId())
				
				);
	}
	public Rental update(Rental target) {
		target.setRentalDate(rentalDate);
		target.setReturnDate(returnDate);
		target.setCustomer(new Customer(customerId));
		target.setInventory(new Inventory(inventoryId));
		target.setStaff(new Staff(customerId));
		
		
			// Borra los alquileres que sobran
			var delAlquiladas = target.getPayments().stream()
					.filter(item -> payments.stream().noneMatch(pago -> pago.getPaymentId() == item.getPaymentId()))
					.toList();
			delAlquiladas.forEach(item -> target.removePayment(item));
			//Modifico los que han quedado
			target.getPayments().forEach(item -> {
				var nuevoPago = payments.stream().filter(pago -> pago.getPaymentId() == item.getPaymentId()).findFirst().get();
				if (item.getAmount() != nuevoPago.getAmount()) {	
					item.setAmount(nuevoPago.getAmount());
				}
				if (item.getPaymentDate() != nuevoPago.getFecha()) {	
					item.setPaymentDate(nuevoPago.getFecha());
				}
				if(item.getStaff().getStaffId() != nuevoPago.getStaff()) {
					item.setStaff(new Staff(nuevoPago.getStaff()));
				}
			});
//			// Añade los alquileres que falta
			payments.stream()
				.filter(paymentDTO -> target.getPayments().stream().noneMatch(alquiler -> alquiler.getPaymentId() == paymentDTO.getPaymentId()))
				.forEach(paymentDTO -> target.addPayment(new Payment(
						paymentDTO.getPaymentId(),
						paymentDTO.getAmount(),
						paymentDTO.getFecha(),
						new Staff(paymentDTO.getStaff()),
						target)));
			return target;
	}
}