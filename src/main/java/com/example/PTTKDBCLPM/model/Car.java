package com.example.PTTKDBCLPM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table(name = "car")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name ;
	@Column(name = "license_plate")
	private String  license_plate ;
	@Column(name = "model")
	private String model ;
	@Column(name = "car_company")
	private String car_company;
	@Column(name = "note")
	private String note ;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLicense_plate() {
		return license_plate;
	}
	public String getModel() {
		return model;
	}
	public String getCar_company() {
		return car_company;
	}
	public String getNote() {
		return note;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setCar_company(String car_company) {
		this.car_company = car_company;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
