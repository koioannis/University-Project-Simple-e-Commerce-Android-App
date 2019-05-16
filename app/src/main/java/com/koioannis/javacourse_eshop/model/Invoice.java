
package model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class Invoice {
	
	private String seq;                     // the unique invoice number
	private String firstName;
	private String lastName;
	private Customer customer;
	private BigDecimal totalOrder;
	private List<Product> orderedProducts;
	private Date date;
	private Cashier cashier;
	private BigDecimal amountReceived;
	private BigDecimal amountDue;

	
	
	
	public Invoice() {
	}

	public Invoice(String seq, String firstName, String lastName, Customer customer, List<Product> orderedProducts, Cashier cashier) {
		this.seq = seq;
		this.firstName = firstName;
		this.lastName = lastName;
		this.customer = customer;
		this.orderedProducts = orderedProducts;
		this.cashier = cashier;
	}
	
	public String getSeq() {
		return seq;
	}

	public Invoice(String seq) {
		this.seq = seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BigDecimal getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(BigDecimal totalOrder) {
		this.totalOrder = totalOrder;
	}

	public List<Product> getOrderedProducts() {
		return orderedProducts;
	}

	public void setOrderedProducts(List<Product> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Cashier getCashier() {
		return cashier;
	}

	public void setCashier(Cashier cashier) {
		this.cashier = cashier;
	}

	public BigDecimal getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(BigDecimal amountReceived) {
		this.amountReceived = amountReceived;
	}

	public BigDecimal getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(BigDecimal amountDue) {
		this.amountDue = amountDue;
	}
	
	
	
	
	
}
