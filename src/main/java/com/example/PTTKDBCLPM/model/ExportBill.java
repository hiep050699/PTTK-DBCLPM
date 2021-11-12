package com.example.PTTKDBCLPM.model;

import java.sql.Date;

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
@Table(name = "exportbill")
public class ExportBill  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "warehouseemloyee_id")
	private WareHouseEmployee wareHouseEmployee;
	@ManyToOne
	@JoinColumn(name = "technicalemployee_id")
	private TechnicalEmployee technicalEmployee;
	@Column(name = "note")
	private String note;
	
	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	
	@Column(name = "created_date")
	private Date created_date;
	
	public ExportBill() {
		super();
	}

	public Long getId() {
		return id;
	}

	public WareHouseEmployee getWareHouseEmployee() {
		return wareHouseEmployee;
	}

	public TechnicalEmployee getTechnicalEmployee() {
		return technicalEmployee;
	}

	public String getNote() {
		return note;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setWareHouseEmployee(WareHouseEmployee wareHouseEmployee) {
		this.wareHouseEmployee = wareHouseEmployee;
	}

	public void setTechnicalEmployee(TechnicalEmployee technicalEmployee) {
		this.technicalEmployee = technicalEmployee;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
