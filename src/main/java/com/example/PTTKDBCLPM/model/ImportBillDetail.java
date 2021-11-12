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
@Table(name = "importbilldetail")
public class ImportBillDetail  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "importbill_id")
	private ImportBill import_bill;
	@ManyToOne
	@JoinColumn(name = "accessory_id")
	private Accessory accessory;
	@Column(name = "count")
	private Long count;
	
	public ImportBillDetail() {
		
	}
	
	
	public Long getId() {
		return id;
	}
	public ImportBill getImport_bill() {
		return import_bill;
	}
	public Accessory getAccessory() {
		return accessory;
	}
	public Long getCount() {
		return count;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setImport_bill(ImportBill import_bill) {
		this.import_bill = import_bill;
	}
	public void setAccessory(Accessory accessory) {
		this.accessory = accessory;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	
	
}
