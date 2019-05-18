
package com.koioannis.javacourse_eshop.model;

import java.math.BigDecimal;


public class Product {
	
	private String code;
	private BigDecimal price;
	private String name;


	public Product() {
	}

	public Product(String code, BigDecimal price, String name, String description) {
		this.code = code;
		this.price = price;
		this.name = name;
	}

	public Product(String code) {
		this.code = code;
	}	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
