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
@Table(name = "accessory")
public class Accessory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "note")
	private String note;
	
	@ManyToOne
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;
	
	@Column(name = "count")
	private Long count;
	
	@Column(name = "import_price")
	private Long import_price; 
	
	@Column(name = "export_price")
	private Long export_price ;
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getNote() {
		return note;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public Long getCount() {
		return count;
	}
	public Long getImport_price() {
		return import_price;
	}
	public Long getExport_price() {
		return export_price;
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
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public void setImport_price(Long import_price) {
		this.import_price = import_price;
	}
	public void setExport_price(Long export_price) {
		this.export_price = export_price;
	}
	
	
}
