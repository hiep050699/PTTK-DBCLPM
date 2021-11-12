package com.example.PTTKDBCLPM.model;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.Data;

@Entity

@Table(name = "technicalmanager")
public class TechnicalManager extends User {

}
