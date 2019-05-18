
package com.koioannis.javacourse_eshop.model;

import java.math.BigDecimal;


public class Product {
	
	private String code;
	private BigDecimal price;
	private String name;


	public Product(String code, BigDecimal price, String name) {
		this.code = code;
		this.price = price;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
	
	
	
	
	
	
}
