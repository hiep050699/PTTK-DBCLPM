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
@Table(name = "accessoryservicedetail")
public class AccessoryServiceDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "service_id")
	private Service service;
	
	@ManyToOne
	@JoinColumn(name = "accessory_id")
	private Accessory accessory;
	
	@Column(name = "count")
	private Long count;
	
	
	public Long getId() {
		return id;
	}
	public Service getService() {
		return service;
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
	public void setService(Service service) {
		this.service = service;
	}
	public void setAccessory(Accessory accessory) {
		this.accessory = accessory;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	
	
}
