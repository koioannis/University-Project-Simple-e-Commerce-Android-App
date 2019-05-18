
package com.koioannis.javacourse_eshop.model;

import java.util.List;


public class Shop {
	
	private List<Product> existingProducts;
	private List<Coupon> existingCoupons;

	public Shop() {
	}

	public Shop(List<Product> existingProducts, List<Coupon> existingCoupons) {
		this.existingProducts = existingProducts;
		this.existingCoupons = existingCoupons;
	}

	public List<Product> getExistingProducts() {
		return existingProducts;
	}

	public void setExistingProducts(List<Product> existingProducts) {
		this.existingProducts = existingProducts;
	}


	public List<Coupon> getExistingCoupons() {
		return existingCoupons;
	}

	public void setExistingCoupons(List<Coupon> existingCoupons) {
		this.existingCoupons = existingCoupons;
	}
	
	
	
	
}
