
package model;

import java.util.List;


public class Shop {
	
	private List<Product> existingProducts;
	private List<Customer> existingCustomers;
	private List<Cashier> existingCashiers;
	private List<Membership> existingMemberships;
	private List<Coupon> existingCoupons;

	public Shop() {
	}

	public Shop(List<Product> existingProducts, List<Customer> existingCustomers, List<Cashier> existingCashiers, List<Membership> existingMemberships, List<Coupon> existingCoupons) {
		this.existingProducts = existingProducts;
		this.existingCustomers = existingCustomers;
		this.existingCashiers = existingCashiers;
		this.existingMemberships = existingMemberships;
		this.existingCoupons = existingCoupons;
	}

	public List<Product> getExistingProducts() {
		return existingProducts;
	}

	public void setExistingProducts(List<Product> existingProducts) {
		this.existingProducts = existingProducts;
	}

	public List<Customer> getExistingCustomers() {
		return existingCustomers;
	}

	public void setExistingCustomers(List<Customer> existingCustomers) {
		this.existingCustomers = existingCustomers;
	}

	public List<Cashier> getExistingCashiers() {
		return existingCashiers;
	}

	public void setExistingCashiers(List<Cashier> existingCashiers) {
		this.existingCashiers = existingCashiers;
	}

	public List<Membership> getExistingMemberships() {
		return existingMemberships;
	}

	public void setExistingMemberships(List<Membership> existingMemberships) {
		this.existingMemberships = existingMemberships;
	}

	public List<Coupon> getExistingCoupons() {
		return existingCoupons;
	}

	public void setExistingCoupons(List<Coupon> existingCoupons) {
		this.existingCoupons = existingCoupons;
	}
	
	
	
	
}
