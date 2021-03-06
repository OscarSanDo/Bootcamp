package com.example.application.dtos;

import java.math.BigDecimal;
import java.util.Date;

import com.example.domains.entities.Payment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import lombok.Value;

@Value
@ApiModel(value = "Pagos detallado", description = "Version detallada de los pagos.")
public class PaymentDetailsDTO {

	@JsonProperty("id")
	private int paymentlId;
	@JsonProperty("empleado")
	private String customer;
	@JsonProperty("total")
	private BigDecimal amount;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date paymentdate;

	public static PaymentDetailsDTO from(Payment source) {
		return new PaymentDetailsDTO(source.getPaymentId(),
				source.getStaff().getFirstName() + " " + source.getStaff().getLastName(), source.getAmount(),
				source.getPaymentDate());
	}

}