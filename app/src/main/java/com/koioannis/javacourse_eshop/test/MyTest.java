
package test;

import model.Shop;
import myUtil.DateTools;



public class MyTest {


	public static void main(String[] args) {
		
		// We print the current date and time.
		System.out.println(DateTools.printCurrentDateTime());
		
		// We create a shop and fill it with products, customers, etc.
		Shop myShop = new Shop();
		
		myShop.setExistingProducts(DataHelper.createSomeProducts());
		myShop.setExistingCustomers(DataHelper.createSomeCustomers());
		myShop.setExistingCoupons(DataHelper.createSomeCoupons());
		myShop.setExistingMemberships(DataHelper.createSomeMemberships());
		//myShop.setExistingCashiers(DataHelper.createSomeCashiers());


		
		// create a class: User and two subclasses: Employee and Customer  
		
	}
	

	
	
}
