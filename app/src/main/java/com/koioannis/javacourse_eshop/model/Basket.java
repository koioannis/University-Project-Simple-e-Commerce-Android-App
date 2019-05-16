
package com.koioannis.javacourse_eshop.model;

import java.math.BigDecimal;
import java.util.List;

public class Basket {
	
	private List<Product> productsToOrder;
	private Customer customer;
	private BigDecimal total;
	private boolean isOpen;

	public Basket() {
	}

	public Basket(List<Product> productsToOrder, Customer customer, boolean isOpen) {
		this.productsToOrder = productsToOrder;
		this.customer = customer;
		this.isOpen = isOpen;
	}
	
	public List<Product> getProductsToOrder() {
		return productsToOrder;
	}

	public void setProductsToOrder(List<Product> productsToOrder) {
		this.productsToOrder = productsToOrder;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public boolean isIsOpen() {
		return isOpen;
	}

	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	
	
	
}
