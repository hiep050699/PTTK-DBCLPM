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
@Table(name = "provisionalbilldetail")
public class ProvisionalBillDetail  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "provisionalbill_id")
	private ProvisionalBill provisionalBill;
	@ManyToOne
	@JoinColumn(name = "accessoryservicedetail_id")
	private AccessoryServiceDetail accessoryServiceDetail;
	@Column(name = " count")
	private Long count;
	
	
	public Long getId() {
		return id;
	}
	public ProvisionalBill getProvisionalBill() {
		return provisionalBill;
	}
	public AccessoryServiceDetail getAccessoryServiceDetail() {
		return accessoryServiceDetail;
	}
	public Long getCount() {
		return count;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setProvisionalBill(ProvisionalBill provisionalBill) {
		this.provisionalBill = provisionalBill;
	}
	public void setAccessoryServiceDetail(AccessoryServiceDetail accessoryServiceDetail) {
		this.accessoryServiceDetail = accessoryServiceDetail;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	
	
}
