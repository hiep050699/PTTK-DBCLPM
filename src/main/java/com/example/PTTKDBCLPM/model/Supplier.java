package com.example.PTTKDBCLPM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "supplier")
public class Supplier  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name ;
	@Column(name = "address")
	private String address ;
	@Column(name = "email")
	private String email;
	@Column(name = "phone_number")
	private String phone_number; 
	@Column(name = "note")
	private String note;
	
	public Supplier() {
		
	}
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public String getNote() {
		return note;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
