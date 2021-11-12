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
@Table(name = "salary")
public class Salary  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	@Column(name = "note")
	private String note ;
	public Long getId() {
		return id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public String getNote() {
		return note;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}
