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
@Table(name = "importbill")
public class ImportBill  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;
	@ManyToOne
	@JoinColumn(name = "warehouseemloyee_id")
	private WareHouseEmployee wareHouseEmployee;
	
	@Column(name="total_money")
	private Long total_money;
	@Column(name="note")
	private String note;
	@Column(name="date_created")
	private Date date_created;
	
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public Long getId() {
		return id;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public WareHouseEmployee getWareHouseEmployee() {
		return wareHouseEmployee;
	}
	public Long getTotal_money() {
		return total_money;
	}
	public String getNote() {
		return note;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public void setWareHouseEmployee(WareHouseEmployee wareHouseEmployee) {
		this.wareHouseEmployee = wareHouseEmployee;
	}
	public void setTotal_money(Long total_money) {
		this.total_money = total_money;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
}
