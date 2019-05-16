
package model;

import java.math.BigDecimal;


public class Product {
	
	private String code;
	private BigDecimal price;
	private String name;
	private String description;
	private Constants.ProductCategory category;


	public Product() {
	}

	public Product(String code, BigDecimal price, String name, String description, Constants.ProductCategory category) {
		this.code = code;
		this.price = price;
		this.name = name;
		this.description = description;
		this.category = category;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Constants.ProductCategory getCategory() {
		return category;
	}

	public void setCategory(Constants.ProductCategory category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
