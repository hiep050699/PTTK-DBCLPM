package com.example.PTTKDBCLPM.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.Data;




@Entity
@Table(name="user")
public abstract class User  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "username")
	private String username ;
	@Column(name = "password")
	private String password ;
	@Column(name = "address")
	private String  address ;
	@Column(name = "fullname")
	private String fullname ;
	@Column(name = "gender")
	private String gender ;
	@Column(name = "phone_number")
	private String phone_number;
	@Column(name = "note")
	private String note;
	@Column(name = "date_of_birth")
	private Date date_of_birth ;
	
	public User() {
		
	}
	
	
	
	public Long getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getAddress() {
		return address;
	}
	public String getFullname() {
		return fullname;
	}
	public String getGender() {
		return gender;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public String getNote() {
		return note;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	
	
	

}
