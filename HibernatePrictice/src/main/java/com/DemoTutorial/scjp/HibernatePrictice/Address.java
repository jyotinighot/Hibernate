package com.DemoTutorial.scjp.HibernatePrictice;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Embeddable
public class Address {
	@Column(name="Address_City")
	String addCity;
	@Column(name="Address_PIN")
	int addPIN;
	public String getAddCity() {
		return addCity;
	}
	public void setAddCity(String addCity) {
		this.addCity = addCity;
	}
	public int getAddPIN() {
		return addPIN;
	}
	public void setAddPIN(int addPIN) {
		this.addPIN = addPIN;
	}
	@Override
	public String toString() {
		return "Address [addCity=" + addCity + ", addPIN=" + addPIN + "]";
	}
	public Address(String addCity, int addPIN) {
		super();
		this.addCity = addCity;
		this.addPIN = addPIN;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
