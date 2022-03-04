package com.example.domains.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import com.example.domains.core.entities.EntityBase;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

/**
 * The persistent class for the rental database table.
 * 
 */
@Entity
@Table(name = "rental")
@NamedQuery(name = "Rental.findAll", query = "SELECT r FROM Rental r")
public class Rental extends EntityBase<Rental> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rental_id")
	private int rentalId;

	@Column(name = "last_update")
	@Generated(value = GenerationTime.ALWAYS)
	private Timestamp lastUpdate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rental_date")
	@NotNull
	private Date rentalDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "return_date")
	private Date returnDate;

	// bi-directional many-to-one association to Customer
	@ManyToOne
	@NotNull
	@JoinColumn(name = "customer_id")
	private Customer customer;

	// bi-directional many-to-one association to Inventory
	@ManyToOne
	@NotNull
	@JoinColumn(name = "inventory_id")
	private Inventory inventory;

	// bi-directional many-to-one association to Staff
	@ManyToOne
	@NotNull
	@JoinColumn(name = "staff_id")
	private Staff staff;

	// bi-directional many-to-one association to Payment
	@OneToMany(mappedBy = "rental", cascade = CascadeType.ALL, orphanRemoval = true)
	@Valid
	private List<Payment> payments;

	public Rental() {
		super();
		payments = new ArrayList<Payment>();
	}

	public Rental(int rentalId) {
		this();
		this.rentalId = rentalId;
	}

	public Rental(int rentalId, @Valid List<Payment> payments, Customer customer) {
		super();
		this.rentalId = rentalId;
		this.payments = payments;
		this.customer = customer;
	}

	public Rental(int rentalId, @NotNull Date rentalDate, Date returnDate, @Positive @NotNull Inventory inventory,
			@Positive @NotNull Customer customer, @Positive @NotNull Staff staff) {
		this();
		this.rentalId = rentalId;
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
		this.inventory = inventory;
		this.customer = customer;
		this.staff = staff;

	}

	public int getRentalId() {
		return this.rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getRentalDate() {
		return this.rentalDate;
	}

	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public List<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;

	}

	public Payment addPayment(Payment payment) {
		getPayments().add(payment);
		payment.setRental(this);
		payment.setCustomer(getCustomer());

		return payment;
	}

	public Payment removePayment(Payment payment) {
		getPayments().remove(payment);
		payment.setRental(null);

		return payment;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Inventory getInventory() {
		return this.inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rentalId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rental))
			return false;
		return rentalId == ((Rental) obj).rentalId;
	}

	@Override
	public String toString() {
		return "Rental [rentalId=" + rentalId + ", rentalDate=" + rentalDate + ", returnDate=" + returnDate
				+ ", payments=" + payments + ", customer=" + customer + ", inventory=" + inventory + ", staff=" + staff
				+ "]";
	}

}