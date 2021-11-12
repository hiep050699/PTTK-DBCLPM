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
@Table(name = "exportbilldetail")
public class ExportBillDetail  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "exportbill_id")
	private ExportBill exportBill;
	@ManyToOne
	@JoinColumn(name = "accessory_id")
	private Accessory accessory;
	@Column(name = "count")
	private Long count;
	public Long getId() {
		return id;
	}
	public ExportBill getExportBill() {
		return exportBill;
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
	public void setExportBill(ExportBill exportBill) {
		this.exportBill = exportBill;
	}
	public void setAccessory(Accessory accessory) {
		this.accessory = accessory;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	
	
}
