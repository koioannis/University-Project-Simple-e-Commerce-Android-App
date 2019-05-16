
package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.Cashier;
import model.Constants;
import model.Coupon;
import model.Customer;
import model.Membership;
import model.Product;


public class DataHelper {
	
		protected static List<Product> createSomeProducts() {
		List<Product> someProducts = new ArrayList<Product>();
		
		Product p01 = new Product("p01", new BigDecimal(29.90), "Clean Code", "A book on software engineering", Constants.ProductCategory.BOOK);
		someProducts.add(p01);
		Product p02 = new Product("p02", new BigDecimal(45.90), "Design Patterns", "Book about applying programming practices", Constants.ProductCategory.BOOK);
		someProducts.add(p02);
		Product p03 = new Product("p03", new BigDecimal(25.50), "Grokking Algorithms", "A book on algorithms", Constants.ProductCategory.BOOK);
		someProducts.add(p03);		
		Product p04 = new Product("p04", new BigDecimal(71.00), "Introduction to Algorithms", "A reference book about algorithms", Constants.ProductCategory.BOOK);
		someProducts.add(p04);		
		Product p05 = new Product("p05", new BigDecimal(9.89), "Lion King", "A movie", Constants.ProductCategory.MEDIA);
		someProducts.add(p05);	
		Product p06 = new Product("p06", new BigDecimal(8.85), "Aladdin", "Animation movie", Constants.ProductCategory.MEDIA);
		someProducts.add(p06);	
		Product p07 = new Product("p07", new BigDecimal(7.71), "Peter Pan", "A fairytale for small kids", Constants.ProductCategory.MEDIA);
		someProducts.add(p07);		
		Product p08 = new Product("p08", new BigDecimal(164.55), "PhoneS", "A mobile phone model", Constants.ProductCategory.TECH);
		someProducts.add(p08);	
		Product p09 = new Product("p09", new BigDecimal(507.88), "CompX1", "A laptop", Constants.ProductCategory.TECH);
		someProducts.add(p09);	
		Product p10 = new Product("p10", new BigDecimal(980.05), "CompX2", "A powerful laptop", Constants.ProductCategory.TECH);
		someProducts.add(p10);	
		Product p11 = new Product("p11", new BigDecimal(77.02), "Shot360", "A hobbyist camera", Constants.ProductCategory.TECH);
		someProducts.add(p11);			
		
		return someProducts;
	}
	
	
	protected static List<Customer> createSomeCustomers() {
		List<Customer> someCustomers = new ArrayList<Customer>();
		
		// create some!
		
		return someCustomers;
	}
	
	protected static List<Coupon> createSomeCoupons() {
		List<Coupon> list = new ArrayList<Coupon>();
		
		// create some!
		
		return list;
	}
	
	protected static List<Membership> createSomeMemberships() {
		List<Membership> list = new ArrayList<Membership>();
		
		// create some!
		
		return list;
	}
	
	protected static List<Cashier> createSomeCashiers() {
		List<Cashier> list = new ArrayList<Cashier>();
		
		// create some!
		
		return list;
	}
	
}
