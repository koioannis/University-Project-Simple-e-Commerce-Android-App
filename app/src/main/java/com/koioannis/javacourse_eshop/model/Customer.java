package com.koioannis.javacourse_eshop.model;


public class Customer {

	String name, email, address, postalCode, telephone;


	public Customer(String name, String email, String address, String postalCode, String telephone) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.postalCode = postalCode;
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getAddress() {
		return address;
	}

	public String getTelephone() {
		return telephone;
	}
}
