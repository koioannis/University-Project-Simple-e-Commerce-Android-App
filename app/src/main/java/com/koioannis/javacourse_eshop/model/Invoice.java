
package com.koioannis.javacourse_eshop.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Invoice {
	
	private String seq;                     // the unique invoice number
	private String customerName;
	private double totalPrice;
	private ArrayList<Integer> productsQuantity;
	private List<Product> orderedProducts;
	private Date date;

	public Invoice(String seq, String customerName, List<Product> orderedProducts, double totalPrice) {
		this.seq = seq;
		this.customerName = customerName;
		this.orderedProducts = orderedProducts;
		this.totalPrice = totalPrice;
		date = new Date();
	}

	public String getDate(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		return dateFormat.format(date);
	}

	public String getSeq() {
		return seq;
	}

	public String getName() {
		return customerName;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public ArrayList<Integer> getProductsQuantity() {
		return productsQuantity;
	}

	public List<Product> getOrderedProducts() {
		return orderedProducts;
	}
}
