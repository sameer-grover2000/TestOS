package com.app.testOS.model;

public class Persons {

	public Persons() {
		// TODO Auto-generated constructor stub
	}

	public Persons(String name, String address) {
		this.name = name;
		this.address = address;
	}

	private String name;

	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
