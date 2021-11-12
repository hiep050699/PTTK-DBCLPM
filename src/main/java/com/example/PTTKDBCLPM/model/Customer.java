package com.example.PTTKDBCLPM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fullname")
	private String fullname ;
	@Column(name = "gender")
	private String gender ; 
	@Column(name = "email")
	private String email ;
	@Column(name = "phone_number")
	private String phone_number ;
	@Column(name = "note")
	private String note;
	
	public Customer() {
		
	}
	
	public Long getId() {
		return id;
	}
	public String getFullname() {
		return fullname;
	}
	public String getGender() {
		return gender;
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
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
