
package com.koioannis.javacourse_eshop.model;


public class Customer {
	
	private String customerId;
	private String firstName;
	private String lastName;
	private Membership membership;

	public Customer() {
	}

	public Customer(String customerId, String firstName, String lastName) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Customer(String customerId, String firstName, String lastName, Membership membership) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.membership = membership;
	}

	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Membership getMembership() {
		return membership;
	}

	public void setMembership(Membership membership) {
		this.membership = membership;
	}
	
	
	
	
}
