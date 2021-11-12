package com.example.PTTKDBCLPM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "service")
public class Service {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name ;
	@Column(name = "note")
	private String note;
	@Column(name = "price")
	private Long price;
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getNote() {
		return note;
	}
	public Long getPrice() {
		return price;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	
}
