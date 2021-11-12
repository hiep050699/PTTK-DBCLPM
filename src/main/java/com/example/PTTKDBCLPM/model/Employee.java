package com.example.PTTKDBCLPM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "employee")


public abstract class Employee extends User {

	
	private String position;
	private Long hard_salary;
	public String getPosition() {
		return position;
	}
	public Long getHard_salary() {
		return hard_salary;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setHard_salary(Long hard_salary) {
		this.hard_salary = hard_salary;
	}
	
}
