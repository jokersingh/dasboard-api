package com.fullstack.spring.dashboardapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TBL_FILE_DETAILS")
@JsonIgnoreProperties(value = {"id"})
public class FileDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5648801595532008671L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "ID")
	private Long id;
	@Column(name = "MAKE")
	private String make;
	@Column(name = "MODEL")
	private String model;
	@Column(name = "PRICE")
	private Long price;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
}
