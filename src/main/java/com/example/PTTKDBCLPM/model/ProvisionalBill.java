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
@Table(name = "provisionalbill")
public class ProvisionalBill  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "technicalmanager_id")
	private TechnicalManager technicalManager;
	@ManyToOne
	@JoinColumn(name = "car_id")
	private Car car;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "accounting_id")
	private Accounting accounting;
	
	@ManyToOne
	@JoinColumn(name = "slot_id")
	private Slot slot;
	@ManyToOne
	@JoinColumn(name = "technicalemployee_id")
	private TechnicalEmployee technicalEmployee;
	@Column(name = "note")
	private String note;
	@Column(name= "total_money ")
	private Long total_money;
	
	@Column(name = "created_date")
	private Date created_date;
	
	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public ProvisionalBill() {
		super();
	}

	public Long getId() {
		return id;
	}

	public TechnicalManager getTechnicalManager() {
		return technicalManager;
	}

	public Car getCar() {
		return car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Accounting getAccounting() {
		return accounting;
	}

	public Slot getSlot() {
		return slot;
	}

	public TechnicalEmployee getTechnicalEmployee() {
		return technicalEmployee;
	}

	public String getNote() {
		return note;
	}

	public Long getTotal_money() {
		return total_money;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTechnicalManager(TechnicalManager technicalManager) {
		this.technicalManager = technicalManager;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setAccounting(Accounting accounting) {
		this.accounting = accounting;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	public void setTechnicalEmployee(TechnicalEmployee technicalEmployee) {
		this.technicalEmployee = technicalEmployee;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setTotal_money(Long total_money) {
		this.total_money = total_money;
	}
	
	
}
